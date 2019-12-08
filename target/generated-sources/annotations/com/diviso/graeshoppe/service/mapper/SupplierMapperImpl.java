package com.diviso.graeshoppe.service.mapper;

import com.diviso.graeshoppe.client.product.model.Address;
import com.diviso.graeshoppe.client.product.model.Contact;
import com.diviso.graeshoppe.client.product.model.Supplier;
import com.diviso.graeshoppe.client.product.model.SupplierDTO;
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
public class SupplierMapperImpl implements SupplierMapper {

    @Override
    public Supplier toEntity(SupplierDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Supplier supplier = new Supplier();

        supplier.setCompanyName( dto.getCompanyName() );
        supplier.setCreditLimit( dto.getCreditLimit() );
        supplier.setCurrentDebt( dto.getCurrentDebt() );
        supplier.setDebtDate( dto.getDebtDate() );
        supplier.setIDPcode( dto.getIDPcode() );
        supplier.setId( dto.getId() );
        supplier.setVisible( dto.isVisible() );

        return supplier;
    }

    @Override
    public List<Supplier> toEntity(List<SupplierDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<Supplier> list = new ArrayList<Supplier>( dtoList.size() );
        for ( SupplierDTO supplierDTO : dtoList ) {
            list.add( toEntity( supplierDTO ) );
        }

        return list;
    }

    @Override
    public List<SupplierDTO> toDto(List<Supplier> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<SupplierDTO> list = new ArrayList<SupplierDTO>( entityList.size() );
        for ( Supplier supplier : entityList ) {
            list.add( toDto( supplier ) );
        }

        return list;
    }

    @Override
    public SupplierDTO toDto(Supplier supplier) {
        if ( supplier == null ) {
            return null;
        }

        SupplierDTO supplierDTO = new SupplierDTO();

        Long id = supplierContactId( supplier );
        if ( id != null ) {
            supplierDTO.setContactId( id );
        }
        Long id1 = supplierAddressId( supplier );
        if ( id1 != null ) {
            supplierDTO.setAddressId( id1 );
        }
        supplierDTO.setCompanyName( supplier.getCompanyName() );
        supplierDTO.setCreditLimit( supplier.getCreditLimit() );
        supplierDTO.setCurrentDebt( supplier.getCurrentDebt() );
        supplierDTO.setDebtDate( supplier.getDebtDate() );
        supplierDTO.setIDPcode( supplier.getIDPcode() );
        supplierDTO.setId( supplier.getId() );
        supplierDTO.setVisible( supplier.isVisible() );

        return supplierDTO;
    }

    private Long supplierContactId(Supplier supplier) {
        if ( supplier == null ) {
            return null;
        }
        Contact contact = supplier.getContact();
        if ( contact == null ) {
            return null;
        }
        Long id = contact.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long supplierAddressId(Supplier supplier) {
        if ( supplier == null ) {
            return null;
        }
        Address address = supplier.getAddress();
        if ( address == null ) {
            return null;
        }
        Long id = address.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
