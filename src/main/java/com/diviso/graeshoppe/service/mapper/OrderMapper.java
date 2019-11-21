package com.diviso.graeshoppe.service.mapper;


import org.mapstruct.*;

import com.diviso.graeshoppe.client.order.model.Order;
import com.diviso.graeshoppe.client.order.model.OrderDTO;

/**
 * Mapper for the entity Order and its DTO OrderDTO.
 */
@Mapper(componentModel = "spring", uses = {DeliveryInfoMapper.class, ApprovalDetailsMapper.class, StatusMapper.class})
public interface OrderMapper extends EntityMapper<OrderDTO, Order> {

   
    OrderDTO toDto(Order order);

    Order toEntity(OrderDTO orderDTO);

   
}
