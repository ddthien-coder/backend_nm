package com.webapp.nguyenminh.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.webapp.nguyenminh.config.GeneralConfig;
import com.webapp.nguyenminh.entity.ProductEntity;
import com.webapp.nguyenminh.entity.ProductImageEntity;
import com.webapp.nguyenminh.reppository.ProductCategoryRepository;
import com.webapp.nguyenminh.reppository.ProductImageRepository;
import com.webapp.nguyenminh.reppository.ProductRepository;

@Service
@Transactional
@Qualifier("productService")
public class ProductServiceImpl implements ProductService{
	
	@Autowired GeneralConfig config;
	@Autowired ProductCategoryRepository productCatRepo;
	@Autowired ProductRepository productRepo;
	@Autowired ProductImageRepository productImageRepo;

	@Override
	public List<ProductEntity> loadAllProducts() {
		return productRepo.findAll();
	}

	@Override
	public Optional<ProductEntity> getProduct(String productId) {
		return productRepo.findById(productId);
	}
	
	@Override
	public Optional<ProductImageEntity> getProductImage(String fileId) {
		return productImageRepo.findById(fileId);
	}
}
