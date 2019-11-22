package com.diviso.graeshoppe.service.mapper;


import org.mapstruct.*;

import com.diviso.graeshoppe.client.order.model.aggregator.Order;
import com.diviso.graeshoppe.client.order.model.OrderDTO;

/**
 * Mapper for the entity Order and its DTO OrderDTO.
 */
@Mapper(componentModel = "spring", uses = {DeliveryInfoMapper.class, ApprovalDetailsMapper.class, StatusMapper.class})
public interface OrderMapper extends EntityMapper<OrderDTO, Order> {

    @Mapping(source = "deliveryInfo.id", target = "deliveryInfoId")
    OrderDTO toDto(Order order);

    @Mapping(source = "deliveryInfoId", target = "deliveryInfo.id")
    Order toEntity(OrderDTO orderDTO);

   
}
