package com.diviso.graeshoppe.service.mapper;


import org.mapstruct.*;

import com.diviso.graeshoppe.client.order.model.Offer;
import com.diviso.graeshoppe.client.order.model.OfferDTO;

/**
 * Mapper for the entity Offer and its DTO OfferDTO.
 */
@Mapper(componentModel = "spring", uses = {OrderMapper.class})
public interface OfferMapper extends EntityMapper<OfferDTO, Offer> {

    @Override
	@Mapping(source = "order.id", target = "orderId")
    OfferDTO toDto(Offer offer);

    @Override
	@Mapping(source = "orderId", target = "order")
    Offer toEntity(OfferDTO offerDTO);

    default Offer fromId(Long id) {
        if (id == null) {
            return null;
        }
        Offer offer = new Offer();
        offer.setId(id);
        return offer;
    }
}
