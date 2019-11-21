package com.diviso.graeshoppe.service.mapper;


import org.mapstruct.*;

import com.diviso.graeshoppe.client.order.model.DeliveryInfo;
import com.diviso.graeshoppe.client.order.model.DeliveryInfoDTO;

/**
 * Mapper for the entity DeliveryInfo and its DTO DeliveryInfoDTO.
 */
@Mapper(componentModel = "spring", uses = {AddressMapper.class})
public interface DeliveryInfoMapper extends EntityMapper<DeliveryInfoDTO, DeliveryInfo> {

    @Override
	@Mapping(source = "deliveryAddress.id", target = "deliveryAddressId")
    DeliveryInfoDTO toDto(DeliveryInfo deliveryInfo);

    @Override
	@Mapping(source = "deliveryAddressId", target = "deliveryAddress")
    DeliveryInfo toEntity(DeliveryInfoDTO deliveryInfoDTO);

    default DeliveryInfo fromId(Long id) {
        if (id == null) {
            return null;
        }
        DeliveryInfo deliveryInfo = new DeliveryInfo();
        deliveryInfo.setId(id);
        return deliveryInfo;
    }
}
