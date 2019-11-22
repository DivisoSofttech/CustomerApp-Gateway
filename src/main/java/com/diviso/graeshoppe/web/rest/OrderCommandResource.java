package com.diviso.graeshoppe.web.rest;

import java.security.Principal;
import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.diviso.graeshoppe.client.order.api.AddressResourceApi;
import com.diviso.graeshoppe.client.order.api.AuxilaryOrderLineResourceApi;
import com.diviso.graeshoppe.client.order.api.DeliveryInfoCommandResourceApi;
import com.diviso.graeshoppe.client.order.api.NotificationResourceApi;
import com.diviso.graeshoppe.client.order.api.OfferResourceApi;
import com.diviso.graeshoppe.client.order.api.OrderCommandResourceApi;
import com.diviso.graeshoppe.client.order.api.OrderLineCommandResourceApi;
import com.diviso.graeshoppe.client.order.api.OrderLineResourceApi;
import com.diviso.graeshoppe.client.order.api.OrderQueryResourceApi;
import com.diviso.graeshoppe.client.order.model.CommandResource;
import com.diviso.graeshoppe.client.order.model.OrderDTO;
import com.diviso.graeshoppe.client.order.model.aggregator.OrderLine;
import com.diviso.graeshoppe.client.payment.model.OrderResponse;
import com.diviso.graeshoppe.client.order.model.OrderLineDTO;
import com.diviso.graeshoppe.service.QueryService;
import com.diviso.graeshoppe.service.mapper.AuxilaryOrderLineMapper;
import com.diviso.graeshoppe.service.mapper.DeliveryInfoMapper;
import com.diviso.graeshoppe.service.mapper.OfferMapper;
import com.diviso.graeshoppe.service.mapper.OrderLineMapper;
import com.diviso.graeshoppe.service.mapper.OrderMapper;

import afu.org.checkerframework.checker.units.qual.h;

import com.diviso.graeshoppe.client.order.model.Address;
import com.diviso.graeshoppe.client.order.model.AddressDTO;
import com.diviso.graeshoppe.client.order.model.aggregator.AuxilaryOrderLine;
import com.diviso.graeshoppe.client.order.model.AuxilaryOrderLineDTO;
import com.diviso.graeshoppe.client.order.model.aggregator.DeliveryInfo;
import com.diviso.graeshoppe.client.order.model.DeliveryInfoDTO;
import com.diviso.graeshoppe.client.order.model.NotificationDTO;
import com.diviso.graeshoppe.client.order.model.aggregator.Offer;
import com.diviso.graeshoppe.client.order.model.OfferDTO;
import com.diviso.graeshoppe.client.order.model.aggregator.Order;
import com.diviso.graeshoppe.client.order.model.aggregator.OrderInitiateResponse;

@RestController
@RequestMapping("/api/command")
public class OrderCommandResource {

	private static final Logger LOG = LoggerFactory.getLogger(OrderCommandResource.class);
	@Autowired
	private OrderCommandResourceApi orderCommandResourceApi;
	@Autowired
	private OrderLineResourceApi orderLineResourceApi;
	@Autowired
	private OrderLineCommandResourceApi orderLineCommandResource;
	@Autowired
	private AuxilaryOrderLineResourceApi auxilaryOrderLineApi;
	@Autowired
	private DeliveryInfoCommandResourceApi deliveryInfoCommandApi;
	@Autowired
	private OrderQueryResourceApi orderQueryResource;
	@Autowired
	private NotificationResourceApi notificationResourceApi;

	@Autowired
	private OfferResourceApi offerResourceApi;
	@Autowired
	private QueryService queryService;

	@Autowired
	private AddressResourceApi addressResourceApi;

	@Autowired
	private SimpMessagingTemplate messagingTemplate;

	@Autowired
	private OrderMapper orderMapper;

	@Autowired
	private AuxilaryOrderLineMapper auxilaryOrderLineMapper;

	@Autowired
	private OrderLineMapper orderLineMapper;

	@Autowired
	private DeliveryInfoMapper deliveryInfoMapper;

	@Autowired
	private OfferMapper offerMapper;

	@GetMapping("/sendMessage")
	public String send(Principal principal) {
		messagingTemplate.convertAndSendToUser("test", "/queue/notification", "Message from " + principal.getName());
		return "done";
	}

	@PostMapping("/order/initiateOrder")
	public ResponseEntity<OrderInitiateResponse> initiateOrder(@RequestBody Order order) {
		OrderInitiateResponse orderResponse = new OrderInitiateResponse();
		OrderDTO orderDTO = orderMapper.toDto(order);
		ResponseEntity<CommandResource> resource = createOrder(orderDTO);
		Order orderResult = orderMapper.toEntity(orderDTO);
		orderResult.setId(resource.getBody().getSelfId());
		orderResult.setOrderId(resource.getBody().getOrderId());
		orderResponse.setCommandResource(resource.getBody());
		orderResponse.setOrder(orderResult);
		order.getOrderLines().forEach(orderLine -> {
			OrderLineDTO orderLineDTO = orderLineMapper.toDto(orderLine);
			orderLineDTO.setOrderId(resource.getBody().getSelfId());
			OrderLineDTO lineDTOResult = createOrderLine(orderLineDTO).getBody();
			OrderLine orderLineResult = orderLineMapper.toEntity(lineDTOResult);
			orderLine.getRequiedAuxilaries().forEach(auxilaryOrderLine -> {
				AuxilaryOrderLineDTO auxilaryOrderLineDTO = auxilaryOrderLineMapper.toDto(auxilaryOrderLine);
				auxilaryOrderLineDTO.setOrderLineId(lineDTOResult.getId());
				AuxilaryOrderLineDTO auxilaryOrderLineDTOresult = createAuxilaryLineItem(auxilaryOrderLineDTO)
						.getBody();
				AuxilaryOrderLine auxilaryOrderLineresult = auxilaryOrderLineMapper
						.toEntity(auxilaryOrderLineDTOresult);
				orderLineResult.getRequiedAuxilaries().add(auxilaryOrderLineresult);
			});
			orderResponse.getOrder().getOrderLines().add(orderLineResult);
		});
		order.getAppliedOffers().forEach(offer -> {
			OfferDTO offerDTO = offerMapper.toDto(offer);
			offerDTO.setOrderId(resource.getBody().getSelfId());
			OfferDTO offerDTOResult = createOfferLine(offerDTO).getBody();
			Offer offerResult = offerMapper.toEntity(offerDTOResult);
			orderResponse.getOrder().getAppliedOffers().add(offerResult);
		});

		return ResponseEntity.ok(orderResponse);
	}

	public ResponseEntity<AuxilaryOrderLineDTO> createAuxilaryLineItem(AuxilaryOrderLineDTO auxilaryOrderLineDTO) {
		return auxilaryOrderLineApi.createAuxilaryOrderLineUsingPOST(auxilaryOrderLineDTO);
	}

	public ResponseEntity<OfferDTO> createOfferLine(OfferDTO offerDTO) {
		LOG.info("OfferDTO in create Offerline is " + offerDTO);
		return offerResourceApi.createOfferUsingPOST(offerDTO);
	}

	@GetMapping("/orders/addresses/{customerId}")
	public Page<Address> getAllSavedAddress(@PathVariable String customerId, Pageable pageable) {
		return queryService.findByCustomerId(customerId, pageable);
	}

	@PostMapping("/orders/addresses")
	public ResponseEntity<AddressDTO> createAddress(@RequestBody AddressDTO addressDTO) {
		ResponseEntity<AddressDTO> result = addressResourceApi.createAddressUsingPOST(addressDTO);
		return result;
	}

	@PostMapping("/orders/collectDeliveryDetails/{taskId}/{orderId}")
	public ResponseEntity<CommandResource> collectDeliveryDetails(@RequestBody DeliveryInfo deliveryInfo,
			@PathVariable String taskId, @PathVariable String orderId) {
		DeliveryInfoDTO deliveryInfoDTO = deliveryInfoMapper.toDto(deliveryInfo);
		if (deliveryInfo.getDeliveryAddress() != null) {
			deliveryInfoDTO.setDeliveryAddressId(deliveryInfo.getDeliveryAddress().getId());
		}
		ResponseEntity<CommandResource> deliveryInfoResult = createDeliveryInfo(taskId, deliveryInfoDTO, orderId);
		return deliveryInfoResult;
	}

	public ResponseEntity<CommandResource> createOrder(@RequestBody OrderDTO orderDTO) {

		return orderCommandResourceApi.createOrderUsingPOST(orderDTO);

	}

	public ResponseEntity<OrderLineDTO> createOrderLine(@RequestBody OrderLineDTO orderLineDTO) {
		return orderLineResourceApi.createOrderLineUsingPOST(orderLineDTO);
	}

	public ResponseEntity<CommandResource> createDeliveryInfo(@PathVariable String taskId,
			@RequestBody DeliveryInfoDTO deliveryInfoDTO, String orderId) {
		return deliveryInfoCommandApi.createDeliveryInfoUsingPOST(taskId, orderId, deliveryInfoDTO);
	}

	public ResponseEntity<DeliveryInfoDTO> updateDeliveryInfo(DeliveryInfoDTO deliveryInfoDTO) {
		return deliveryInfoCommandApi.updateDeliveryInfoUsingPUT(deliveryInfoDTO);
	}

	public ResponseEntity<OrderDTO> updateOrder(OrderDTO orderDTO) {
		return orderCommandResourceApi.updateOrderUsingPUT(orderDTO);
	}

	@PutMapping("/delivery-info")
	public ResponseEntity<DeliveryInfoDTO> editDeliveryInfo(@RequestBody DeliveryInfo deliveryInfo) {
		DeliveryInfoDTO deliveryInfoDTO = new DeliveryInfoDTO();
		deliveryInfoDTO.setId(deliveryInfo.getId());
		deliveryInfoDTO.setDeliveryCharge(deliveryInfo.getDeliveryCharge());
		deliveryInfoDTO.setDeliveryType(deliveryInfo.getDeliveryType());
		if (deliveryInfo.getDeliveryAddress() != null) {
			deliveryInfoDTO.setDeliveryAddressId(deliveryInfo.getDeliveryAddress().getId());
		}
		deliveryInfoDTO.setDeliveryNotes(deliveryInfo.getDeliveryNotes());
		ResponseEntity<DeliveryInfoDTO> result = deliveryInfoCommandApi.updateDeliveryInfoUsingPUT(deliveryInfoDTO);
		ResponseEntity<OrderDTO> orderDTO = orderQueryResource.findByDeliveryInfoIdUsingGET(deliveryInfo.getId());
		orderDTO.getBody().setDeliveryInfoId(deliveryInfo.getId());
		orderCommandResourceApi.updateOrderUsingPUT(orderDTO.getBody());
		return result;
	}

	@DeleteMapping("/orders/{id}")
	public void deleteOrderLine(@PathVariable Long id) {
		orderLineCommandResource.deleteOrderLineUsingDELETE(id);
	}

	@DeleteMapping("/auxilaries/{id}")
	public void deleteAuxilaryOrderLine(@PathVariable Long id) {
		auxilaryOrderLineApi.deleteAuxilaryOrderLineUsingDELETE(id);
	}

	@PutMapping("/order")
	public ResponseEntity<Order> editOrder(@RequestBody Order order) {
		OrderDTO orderDTO = orderMapper.toDto(order);
		ResponseEntity<OrderDTO> orderResult = orderCommandResourceApi.updateOrderUsingPUT(orderDTO);
		Order orderResponse = orderMapper.toEntity(orderResult.getBody());
		order.getOrderLines().forEach(orderLine -> {
			OrderLineDTO orderLineDTO = orderLineMapper.toDto(orderLine);
			orderLineDTO.setOrderId(orderDTO.getId());
			OrderLineDTO orderLineResult = orderLineCommandResource.updateOrderLineUsingPUT(orderLineDTO).getBody();
			OrderLine orderLineresponse = orderLineMapper.toEntity(orderLineResult);
			orderLine.getRequiedAuxilaries().forEach(auxilaryOrderLine -> {
				AuxilaryOrderLineDTO auxilaryOrderLineDTO = auxilaryOrderLineMapper.toDto(auxilaryOrderLine);
				auxilaryOrderLineDTO.setOrderLineId(orderLineDTO.getId());
				AuxilaryOrderLineDTO auxilaryOrderLineResult = auxilaryOrderLineApi
						.updateAuxilaryOrderLineUsingPUT(auxilaryOrderLineDTO).getBody();
				AuxilaryOrderLine auxilaryOrderLineResponse  = auxilaryOrderLineMapper.toEntity(auxilaryOrderLineResult);
				orderLineresponse.getRequiedAuxilaries().add(auxilaryOrderLineResponse);
			});
			orderResponse.getOrderLines().add(orderLineresponse);

		});

		order.getAppliedOffers().forEach(offer -> {
			OfferDTO offerDTO = offerMapper.toDto(offer);
			offerDTO.setOrderId(orderDTO.getId());
			OfferDTO offerDTOresult = offerResourceApi.updateOfferUsingPUT(offerDTO).getBody();
			Offer offerResponse = offerMapper.toEntity(offerDTOresult);
			orderResponse.getAppliedOffers().add(offerResponse);
		});
		return ResponseEntity.ok(orderResponse);
	}

	@PutMapping("/notifications")
	public ResponseEntity<NotificationDTO> updateNotification(@RequestBody NotificationDTO notificationDTO) {
		return notificationResourceApi.updateNotificationUsingPUT(notificationDTO);
	}

	@PutMapping("/addresses")
	public ResponseEntity<AddressDTO> updateAddress(@RequestBody AddressDTO addressDTO) {
		return addressResourceApi.updateAddressUsingPUT(addressDTO);
	}

	@DeleteMapping("/addresses/{id}")
	public ResponseEntity<Void> deleteAddress(@PathVariable Long id) {
		return addressResourceApi.deleteAddressUsingDELETE(id);
	}

}
