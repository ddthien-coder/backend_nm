package com.webapp.nguyenminh.converter;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;

import com.webapp.nguyenminh.dto.Product;
import com.webapp.nguyenminh.entity.ProductEntity;

public class ProductConverter extends BaseConverter{

	private static ProductConverter instance;
	
	public static ProductConverter getInstance() {
		if(instance==null) {
			instance = new ProductConverter();	
		}
		return instance;
	}
	
	private ProductConverter() {}
	
	public ProductEntity productDtoToEntity(Product dto) {
		ProductEntity productEntity = mapper.map(dto, ProductEntity.class);
		return productEntity;
	}
	
	public Product productEntityToDto(ProductEntity en) {
		Product dto = mapper.map(en, Product.class);
		return dto;
	}
	
	public List<ProductEntity> productDtoToEntityList(List<Product> list){
		return list.stream().map(i -> { return productDtoToEntity(i); }).collect(Collectors.toList());	
	}
	
	public List<Product> productEntityToDtoList(List<ProductEntity> list){
		return list.stream().map(i -> { return productEntityToDto(i); }).collect(Collectors.toList());	
	}
}
