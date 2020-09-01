package com.webapp.nguyenminh.dto;

import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import lombok.Data;

@JsonInclude(Include.NON_NULL)
@Data
public class ProductImage {

	private String id;
	@NotBlank
	private String fileName;
	private String fileType;
}
