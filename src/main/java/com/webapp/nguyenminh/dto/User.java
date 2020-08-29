package com.webapp.nguyenminh.dto;

import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@JsonInclude(Include.NON_NULL)
@Accessors(chain = true)
@Data    
@NoArgsConstructor
@AllArgsConstructor
public class User {

	private String id;
	private String username;
	private String password;
	private String name;
	private String email;
	private Set<String> role = new HashSet<String>();
	
}