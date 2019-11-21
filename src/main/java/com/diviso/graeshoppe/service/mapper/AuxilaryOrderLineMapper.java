package com.diviso.graeshoppe.service.mapper;


import org.mapstruct.*;

import com.diviso.graeshoppe.client.order.model.AuxilaryOrderLine;
import com.diviso.graeshoppe.client.order.model.AuxilaryOrderLineDTO;

/**
 * Mapper for the entity AuxilaryOrderLine and its DTO AuxilaryOrderLineDTO.
 */
@Mapper(componentModel = "spring", uses = {OrderLineMapper.class})
public interface AuxilaryOrderLineMapper extends EntityMapper<AuxilaryOrderLineDTO, AuxilaryOrderLine> {

    @Override
	@Mapping(source = "orderLine.id", target = "orderLineId")
    AuxilaryOrderLineDTO toDto(AuxilaryOrderLine auxilaryOrderLine);

    @Override
	@Mapping(source = "orderLineId", target = "orderLine")
    AuxilaryOrderLine toEntity(AuxilaryOrderLineDTO auxilaryOrderLineDTO);

    default AuxilaryOrderLine fromId(Long id) {
        if (id == null) {
            return null;
        }
        AuxilaryOrderLine auxilaryOrderLine = new AuxilaryOrderLine();
        auxilaryOrderLine.setId(id);
        return auxilaryOrderLine;
    }
}
