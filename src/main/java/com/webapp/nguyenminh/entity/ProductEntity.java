package com.webapp.nguyenminh.entity;

import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table(name = "product")
@Data
public class ProductEntity {

	@Id
	@GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
	private String id;
	
	private String name;
	private String unit;
	private int schedule;
	private int amount;
	private int timesPerDay;
	private int durationInDays;
	
	@EqualsAndHashCode.Exclude
	@ManyToOne
	@JoinColumn(name = "category_id", nullable = false)
	private ProductCategoryEntity category;
	
	@EqualsAndHashCode.Exclude
	@OneToOne(mappedBy = "product", cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	private ProductImageEntity image;
	
	
	
}
