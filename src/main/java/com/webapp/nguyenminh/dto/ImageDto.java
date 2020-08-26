package com.webapp.nguyenminh.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ImageDto {
	private String id;
	private String fileName;
	private String fileType;
}
