package com.webapp.nguyenminh.service;

import java.util.List;
import java.util.Optional;

import com.webapp.nguyenminh.entity.ProductEntity;
import com.webapp.nguyenminh.entity.ProductImageEntity;

public interface ProductService {

	List<ProductEntity> loadAllProducts();
	
	
	Optional<ProductEntity> getProduct(String productId);

	Optional<ProductImageEntity> getProductImage(String fileId);

	


}
