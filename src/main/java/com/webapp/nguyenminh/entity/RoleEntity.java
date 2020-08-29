package com.webapp.nguyenminh.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.webapp.nguyenminh.enums.ERole;

import lombok.Data;

@Entity
@Data
@Table(name = "role")
public class RoleEntity {
	
	/**
	 * @author DUCTHIEN
	 */

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Enumerated(EnumType.STRING)
	@Column(length = 20)
	private ERole name;
}
