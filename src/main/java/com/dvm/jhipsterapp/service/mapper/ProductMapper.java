package com.dvm.jhipsterapp.service.mapper;

import com.dvm.jhipsterapp.domain.Product;
import com.dvm.jhipsterapp.domain.ProductCategory;
import com.dvm.jhipsterapp.service.dto.ProductCategoryDTO;
import com.dvm.jhipsterapp.service.dto.ProductDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link Product} and its DTO {@link ProductDTO}.
 */
@Mapper(componentModel = "spring")
public interface ProductMapper extends EntityMapper<ProductDTO, Product> {
    @Mapping(target = "productCategory", source = "productCategory", qualifiedByName = "productCategoryId")
    ProductDTO toDto(Product s);

    @Named("productCategoryId")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    ProductCategoryDTO toDtoProductCategoryId(ProductCategory productCategory);
}
