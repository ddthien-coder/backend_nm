package com.webapp.nguyenminh.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table(name = "product_category")
@Data
public class ProductCategoryEntity {
	
	@Id
	@GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
	private String id;
	private String name;
	
	@EqualsAndHashCode.Exclude 
	@OneToMany(mappedBy = "category", cascade = CascadeType.ALL,fetch = FetchType.EAGER, orphanRemoval = true)
	private Set<ProductEntity> products = new HashSet<ProductEntity>();
}
