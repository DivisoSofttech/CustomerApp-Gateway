package com.diviso.graeshoppe.service.mapper;

import com.diviso.graeshoppe.client.product.model.Address;
import com.diviso.graeshoppe.client.product.model.Location;
import com.diviso.graeshoppe.client.product.model.LocationDTO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2019-12-08T16:21:03+0530",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_222 (Private Build)"
)
@Component
public class LocationMapperImpl implements LocationMapper {

    @Autowired
    private AddressMapper addressMapper;

    @Override
    public List<Location> toEntity(List<LocationDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<Location> list = new ArrayList<Location>( dtoList.size() );
        for ( LocationDTO locationDTO : dtoList ) {
            list.add( toEntity( locationDTO ) );
        }

        return list;
    }

    @Override
    public List<LocationDTO> toDto(List<Location> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<LocationDTO> list = new ArrayList<LocationDTO>( entityList.size() );
        for ( Location location : entityList ) {
            list.add( toDto( location ) );
        }

        return list;
    }

    @Override
    public LocationDTO toDto(Location location) {
        if ( location == null ) {
            return null;
        }

        LocationDTO locationDTO = new LocationDTO();

        Long id = locationAddressId( location );
        if ( id != null ) {
            locationDTO.setAddressId( id );
        }
        locationDTO.setIDPcode( location.getIDPcode() );
        locationDTO.setId( location.getId() );
        locationDTO.setLatLon( location.getLatLon() );
        locationDTO.setName( location.getName() );

        return locationDTO;
    }

    @Override
    public Location toEntity(LocationDTO locationDTO) {
        if ( locationDTO == null ) {
            return null;
        }

        Location location = new Location();

        location.setAddress( addressMapper.fromId( locationDTO.getAddressId() ) );
        location.setIDPcode( locationDTO.getIDPcode() );
        location.setId( locationDTO.getId() );
        location.setLatLon( locationDTO.getLatLon() );
        location.setName( locationDTO.getName() );

        return location;
    }

    private Long locationAddressId(Location location) {
        if ( location == null ) {
            return null;
        }
        Address address = location.getAddress();
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
