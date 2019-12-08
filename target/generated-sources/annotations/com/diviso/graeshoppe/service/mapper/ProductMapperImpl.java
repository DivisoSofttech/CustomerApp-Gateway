package com.diviso.graeshoppe.service.mapper;

import com.diviso.graeshoppe.client.product.model.Brand;
import com.diviso.graeshoppe.client.product.model.Category;
import com.diviso.graeshoppe.client.product.model.Discount;
import com.diviso.graeshoppe.client.product.model.Location;
import com.diviso.graeshoppe.client.product.model.Manufacturer;
import com.diviso.graeshoppe.client.product.model.Product;
import com.diviso.graeshoppe.client.product.model.ProductDTO;
import com.diviso.graeshoppe.client.product.model.TaxCategory;
import com.diviso.graeshoppe.client.product.model.UOM;
import java.util.ArrayList;
import java.util.Arrays;
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
public class ProductMapperImpl implements ProductMapper {

    @Autowired
    private TaxCategoryMapper taxCategoryMapper;
    @Autowired
    private UOMMapper uOMMapper;
    @Autowired
    private LocationMapper locationMapper;
    @Autowired
    private SupplierMapper supplierMapper;
    @Autowired
    private ManufacturerMapper manufacturerMapper;
    @Autowired
    private BrandMapper brandMapper;
    @Autowired
    private DiscountMapper discountMapper;
    @Autowired
    private CategoryMapper categoryMapper;

    @Override
    public List<Product> toEntity(List<ProductDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<Product> list = new ArrayList<Product>( dtoList.size() );
        for ( ProductDTO productDTO : dtoList ) {
            list.add( toEntity( productDTO ) );
        }

        return list;
    }

    @Override
    public List<ProductDTO> toDto(List<Product> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<ProductDTO> list = new ArrayList<ProductDTO>( entityList.size() );
        for ( Product product : entityList ) {
            list.add( toDto( product ) );
        }

        return list;
    }

    @Override
    public ProductDTO toDto(Product product) {
        if ( product == null ) {
            return null;
        }

        ProductDTO productDTO = new ProductDTO();

        Long id = productLocationId( product );
        if ( id != null ) {
            productDTO.setLocationId( id );
        }
        Long id1 = productBrandId( product );
        if ( id1 != null ) {
            productDTO.setBrandId( id1 );
        }
        Long id2 = productManufacturerId( product );
        if ( id2 != null ) {
            productDTO.setManufacturerId( id2 );
        }
        Long id3 = productUnitId( product );
        if ( id3 != null ) {
            productDTO.setUnitId( id3 );
        }
        Long id4 = productDiscountId( product );
        if ( id4 != null ) {
            productDTO.setDiscountId( id4 );
        }
        Long id5 = productCategoryId( product );
        if ( id5 != null ) {
            productDTO.setCategoryId( id5 );
        }
        Long id6 = productTaxCategoryId( product );
        if ( id6 != null ) {
            productDTO.setTaxCategoryId( id6 );
        }
        productDTO.setBuyPrice( product.getBuyPrice() );
        productDTO.setIDPcode( product.getIDPcode() );
        productDTO.setId( product.getId() );
        byte[] image = product.getImage();
        if ( image != null ) {
            productDTO.setImage( Arrays.copyOf( image, image.length ) );
        }
        productDTO.setImageContentType( product.getImageContentType() );
        productDTO.setImageLink( product.getImageLink() );
        productDTO.setIsActive( product.isIsActive() );
        productDTO.setIsAuxilaryItem( product.isIsAuxilaryItem() );
        productDTO.setIsServiceItem( product.isIsServiceItem() );
        productDTO.setMaxQuantityLevel( product.getMaxQuantityLevel() );
        productDTO.setMinQuantityLevel( product.getMinQuantityLevel() );
        productDTO.setName( product.getName() );
        productDTO.setReference( product.getReference() );
        productDTO.setSellingPrice( product.getSellingPrice() );
        productDTO.setShowInCatalogue( product.isShowInCatalogue() );
        productDTO.setSku( product.getSku() );
        productDTO.setStorageCost( product.getStorageCost() );

        return productDTO;
    }

    @Override
    public Product toEntity(ProductDTO productDTO) {
        if ( productDTO == null ) {
            return null;
        }

        Product product = new Product();

        product.setUnit( uOMMapper.fromId( productDTO.getUnitId() ) );
        product.setSupplier( supplierMapper.fromId( productDTO.getSupplierId() ) );
        product.setDiscount( discountMapper.fromId( productDTO.getDiscountId() ) );
        product.setLocation( locationMapper.fromId( productDTO.getLocationId() ) );
        product.setCategory( categoryMapper.fromId( productDTO.getCategoryId() ) );
        product.setBrand( brandMapper.fromId( productDTO.getBrandId() ) );
        product.setTaxCategory( taxCategoryMapper.fromId( productDTO.getTaxCategoryId() ) );
        product.setManufacturer( manufacturerMapper.fromId( productDTO.getManufacturerId() ) );
        product.setBuyPrice( productDTO.getBuyPrice() );
        product.setIDPcode( productDTO.getIDPcode() );
        product.setId( productDTO.getId() );
        byte[] image = productDTO.getImage();
        if ( image != null ) {
            product.setImage( Arrays.copyOf( image, image.length ) );
        }
        product.setImageContentType( productDTO.getImageContentType() );
        product.setImageLink( productDTO.getImageLink() );
        product.setIsActive( productDTO.isIsActive() );
        product.setIsAuxilaryItem( productDTO.isIsAuxilaryItem() );
        product.setIsServiceItem( productDTO.isIsServiceItem() );
        product.setMaxQuantityLevel( productDTO.getMaxQuantityLevel() );
        product.setMinQuantityLevel( productDTO.getMinQuantityLevel() );
        product.setName( productDTO.getName() );
        product.setReference( productDTO.getReference() );
        product.setSellingPrice( productDTO.getSellingPrice() );
        product.setShowInCatalogue( productDTO.isShowInCatalogue() );
        product.setSku( productDTO.getSku() );
        product.setStorageCost( productDTO.getStorageCost() );

        return product;
    }

    private Long productLocationId(Product product) {
        if ( product == null ) {
            return null;
        }
        Location location = product.getLocation();
        if ( location == null ) {
            return null;
        }
        Long id = location.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long productBrandId(Product product) {
        if ( product == null ) {
            return null;
        }
        Brand brand = product.getBrand();
        if ( brand == null ) {
            return null;
        }
        Long id = brand.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long productManufacturerId(Product product) {
        if ( product == null ) {
            return null;
        }
        Manufacturer manufacturer = product.getManufacturer();
        if ( manufacturer == null ) {
            return null;
        }
        Long id = manufacturer.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long productUnitId(Product product) {
        if ( product == null ) {
            return null;
        }
        UOM unit = product.getUnit();
        if ( unit == null ) {
            return null;
        }
        Long id = unit.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long productDiscountId(Product product) {
        if ( product == null ) {
            return null;
        }
        Discount discount = product.getDiscount();
        if ( discount == null ) {
            return null;
        }
        Long id = discount.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long productCategoryId(Product product) {
        if ( product == null ) {
            return null;
        }
        Category category = product.getCategory();
        if ( category == null ) {
            return null;
        }
        Long id = category.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long productTaxCategoryId(Product product) {
        if ( product == null ) {
            return null;
        }
        TaxCategory taxCategory = product.getTaxCategory();
        if ( taxCategory == null ) {
            return null;
        }
        Long id = taxCategory.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
