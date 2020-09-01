package com.webapp.nguyenminh.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import lombok.Data;

@JsonInclude(Include.NON_NULL)
@Data
public class Product {

	private String id;	
	@NotBlank
	private String name;
	@NotBlank
	private String unit;
	@Positive
	private int amount;
	@Positive
	private int schedule;
	@Positive
	private int timesPerDay;
	@Positive
	private int durationInDays;
	private ProductImage image;	
	private ProductCategory category;
}
