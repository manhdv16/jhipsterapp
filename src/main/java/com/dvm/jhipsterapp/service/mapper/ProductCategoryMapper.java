package com.dvm.jhipsterapp.service.mapper;

import com.dvm.jhipsterapp.domain.ProductCategory;
import com.dvm.jhipsterapp.service.dto.ProductCategoryDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link ProductCategory} and its DTO {@link ProductCategoryDTO}.
 */
@Mapper(componentModel = "spring")
public interface ProductCategoryMapper extends EntityMapper<ProductCategoryDTO, ProductCategory> {}
