package com.webapp.nguyenminh.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webapp.nguyenminh.converter.ProductConverter;
import com.webapp.nguyenminh.dto.Product;
import com.webapp.nguyenminh.entity.ProductEntity;
import com.webapp.nguyenminh.exception.AppException;
import com.webapp.nguyenminh.service.ProductService;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/v1/product")
public class ProductController {

	
public static final Logger logger = LoggerFactory.getLogger(ProductController.class);
	
	@Autowired
	@Qualifier("productService")
	ProductService service;
	
	@GetMapping(value = "/list")
	public ResponseEntity<?> loadAllProducts() throws AppException {
		logger.info("Loading all product data");
		List<ProductEntity> historyList = service.loadAllProducts();
		return new ResponseEntity<List<Product>>(ProductConverter.getInstance().productEntityToDtoList(historyList), HttpStatus.OK);
	}
}
