package com.diviso.graeshoppe.service.mapper;

import com.diviso.graeshoppe.client.product.model.Category;
import com.diviso.graeshoppe.client.product.model.CategoryDTO;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2019-12-08T16:21:03+0530",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_222 (Private Build)"
)
@Component
public class CategoryMapperImpl implements CategoryMapper {

    @Override
    public CategoryDTO toDto(Category entity) {
        if ( entity == null ) {
            return null;
        }

        CategoryDTO categoryDTO = new CategoryDTO();

        categoryDTO.setDescription( entity.getDescription() );
        categoryDTO.setIDPcode( entity.getIDPcode() );
        categoryDTO.setId( entity.getId() );
        byte[] image = entity.getImage();
        if ( image != null ) {
            categoryDTO.setImage( Arrays.copyOf( image, image.length ) );
        }
        categoryDTO.setImageContentType( entity.getImageContentType() );
        categoryDTO.setImageLink( entity.getImageLink() );
        categoryDTO.setName( entity.getName() );

        return categoryDTO;
    }

    @Override
    public List<Category> toEntity(List<CategoryDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<Category> list = new ArrayList<Category>( dtoList.size() );
        for ( CategoryDTO categoryDTO : dtoList ) {
            list.add( toEntity( categoryDTO ) );
        }

        return list;
    }

    @Override
    public List<CategoryDTO> toDto(List<Category> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<CategoryDTO> list = new ArrayList<CategoryDTO>( entityList.size() );
        for ( Category category : entityList ) {
            list.add( toDto( category ) );
        }

        return list;
    }

    @Override
    public Category toEntity(CategoryDTO categoryDTO) {
        if ( categoryDTO == null ) {
            return null;
        }

        Category category = new Category();

        category.setDescription( categoryDTO.getDescription() );
        category.setIDPcode( categoryDTO.getIDPcode() );
        category.setId( categoryDTO.getId() );
        byte[] image = categoryDTO.getImage();
        if ( image != null ) {
            category.setImage( Arrays.copyOf( image, image.length ) );
        }
        category.setImageContentType( categoryDTO.getImageContentType() );
        category.setImageLink( categoryDTO.getImageLink() );
        category.setName( categoryDTO.getName() );

        return category;
    }
}
