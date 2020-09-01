package com.webapp.nguyenminh.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table(name = "product_image")
@Data
public class ProductImageEntity {
	

	@Id
	@GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
	private String id;
	
	private String fileName;
	private String fileType;
	
	@EqualsAndHashCode.Exclude 
	@Lob
	private byte[] data;
	
	@EqualsAndHashCode.Exclude 
	@OneToOne
	@JoinColumn(name="product_id", nullable = false)
	ProductEntity product; 
}