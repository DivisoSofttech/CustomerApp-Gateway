package com.diviso.graeshoppe.service.mapper;

import com.diviso.graeshoppe.client.product.model.UOM;
import com.diviso.graeshoppe.client.product.model.UOMDTO;
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
public class UOMMapperImpl implements UOMMapper {

    @Override
    public UOM toEntity(UOMDTO dto) {
        if ( dto == null ) {
            return null;
        }

        UOM uOM = new UOM();

        uOM.setDescription( dto.getDescription() );
        uOM.setIDPcode( dto.getIDPcode() );
        uOM.setId( dto.getId() );
        uOM.setUnit( dto.getUnit() );

        return uOM;
    }

    @Override
    public UOMDTO toDto(UOM entity) {
        if ( entity == null ) {
            return null;
        }

        UOMDTO uOMDTO = new UOMDTO();

        uOMDTO.setDescription( entity.getDescription() );
        uOMDTO.setIDPcode( entity.getIDPcode() );
        uOMDTO.setId( entity.getId() );
        uOMDTO.setUnit( entity.getUnit() );

        return uOMDTO;
    }

    @Override
    public List<UOM> toEntity(List<UOMDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<UOM> list = new ArrayList<UOM>( dtoList.size() );
        for ( UOMDTO uOMDTO : dtoList ) {
            list.add( toEntity( uOMDTO ) );
        }

        return list;
    }

    @Override
    public List<UOMDTO> toDto(List<UOM> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<UOMDTO> list = new ArrayList<UOMDTO>( entityList.size() );
        for ( UOM uOM : entityList ) {
            list.add( toDto( uOM ) );
        }

        return list;
    }
}
