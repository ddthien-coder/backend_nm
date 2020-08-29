package com.webapp.nguyenminh.dto;

import javax.validation.constraints.NotBlank;

import lombok.Data;

@Data
public class LoginRequest {


		@NotBlank
		private String username;
		
		@NotBlank
		private String email;

		@NotBlank
		private String password;

}

