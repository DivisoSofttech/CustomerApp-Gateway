package com.diviso.graeshoppe.service.mapper;


import org.mapstruct.*;

import com.diviso.graeshoppe.client.order.model.OrderLine;
import com.diviso.graeshoppe.client.order.model.OrderLineDTO;

/**
 * Mapper for the entity OrderLine and its DTO OrderLineDTO.
 */
@Mapper(componentModel = "spring", uses = {OrderMapper.class})
public interface OrderLineMapper extends EntityMapper<OrderLineDTO, OrderLine> {

    @Override
	@Mapping(source = "order.id", target = "orderId")
    OrderLineDTO toDto(OrderLine orderLine);

    @Override
	@Mapping(source = "orderId", target = "order")
    @Mapping(target = "requiedAuxilaries", ignore = true)
    OrderLine toEntity(OrderLineDTO orderLineDTO);

    default OrderLine fromId(Long id) {
        if (id == null) {
            return null;
        }
        OrderLine orderLine = new OrderLine();
        orderLine.setId(id);
        return orderLine;
    }
}
