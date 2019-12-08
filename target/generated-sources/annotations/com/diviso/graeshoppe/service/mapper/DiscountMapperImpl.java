package com.diviso.graeshoppe.service.mapper;

import com.diviso.graeshoppe.client.product.model.Discount;
import com.diviso.graeshoppe.client.product.model.DiscountDTO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2019-12-08T16:21:03+0530",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_222 (Private Build)"
)
@Component
public class DiscountMapperImpl implements DiscountMapper {

    @Override
    public Discount toEntity(DiscountDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Discount discount = new Discount();

        discount.setId( dto.getId() );
        discount.setRate( dto.getRate() );

        return discount;
    }

    @Override
    public DiscountDTO toDto(Discount entity) {
        if ( entity == null ) {
            return null;
        }

        DiscountDTO discountDTO = new DiscountDTO();

        discountDTO.setId( entity.getId() );
        discountDTO.setRate( entity.getRate() );

        return discountDTO;
    }

    @Override
    public List<Discount> toEntity(List<DiscountDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<Discount> list = new ArrayList<Discount>( dtoList.size() );
        for ( DiscountDTO discountDTO : dtoList ) {
            list.add( toEntity( discountDTO ) );
        }

        return list;
    }

    @Override
    public List<DiscountDTO> toDto(List<Discount> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<DiscountDTO> list = new ArrayList<DiscountDTO>( entityList.size() );
        for ( Discount discount : entityList ) {
            list.add( toDto( discount ) );
        }

        return list;
    }
}
