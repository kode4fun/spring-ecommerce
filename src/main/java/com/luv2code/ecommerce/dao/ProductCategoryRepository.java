package com.luv2code.ecommerce.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import com.luv2code.ecommerce.entity.ProductCategory;

@RepositoryRestResource(collectionResourceRel = "productCategory", path = "product-category")
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long> {
	@Override
	@RestResource(exported = false)
	default void deleteAll() {
	}

	@Override
	@RestResource(exported = false)
	default void deleteById(Long arg0) {
	}

	@Override
	@RestResource(exported = false)
	default <S extends ProductCategory> S save(S arg0) {
		return null;
	}

	@Override
	@RestResource(exported = false)
	default <S extends ProductCategory> List<S> saveAll(Iterable<S> entities) {
		return null;
	}
}
