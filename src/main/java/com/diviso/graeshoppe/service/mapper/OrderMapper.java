package com.diviso.graeshoppe.service.mapper;


import org.mapstruct.*;

import com.diviso.graeshoppe.client.order.model.Order;
import com.diviso.graeshoppe.client.order.model.OrderDTO;

/**
 * Mapper for the entity Order and its DTO OrderDTO.
 */
@Mapper(componentModel = "spring", uses = {DeliveryInfoMapper.class, ApprovalDetailsMapper.class, StatusMapper.class})
public interface OrderMapper extends EntityMapper<OrderDTO, Order> {

    @Mapping(source = "deliveryInfo.id", target = "deliveryInfoId")
    @Mapping(source = "approvalDetails.id", target = "approvalDetailsId")
    @Mapping(source = "status.id", target = "statusId")
    OrderDTO toDto(Order order);

    @Mapping(source = "deliveryInfoId", target = "deliveryInfo")
    @Mapping(source = "approvalDetailsId", target = "approvalDetails")
    @Mapping(target = "orderLines", ignore = true)
    @Mapping(target = "appliedOffers", ignore = true)
    @Mapping(source = "statusId", target = "status")
    Order toEntity(OrderDTO orderDTO);

    default Order fromId(Long id) {
        if (id == null) {
            return null;
        }
        Order order = new Order();
        order.setId(id);
        return order;
    }
}
