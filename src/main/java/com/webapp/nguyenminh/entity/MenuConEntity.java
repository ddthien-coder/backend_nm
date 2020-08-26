package com.webapp.nguyenminh.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "menu_con")
public class MenuConEntity {
	@Id
	@GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
	private String id;
	
	private String name_1;
	private String name_2;
	private String name_3;
	private String name_4;
	private String name_5;
	private String name_6;
	private String name_7;
	private String name_8;
	private String name_9;
	private String name_10;
	
	@EqualsAndHashCode.Exclude
	@ToString.Exclude
	@Lob
	@Column(columnDefinition = "BLOB")
	private byte[] data;
	
}
