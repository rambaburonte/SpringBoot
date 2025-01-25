package com.rs.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="veg")
public class VegEntity {
	
	@Id
	@SequenceGenerator(sequenceName = "veg",initialValue = 1001,allocationSize = 1,name="k1")
	@GeneratedValue(generator = "k1",strategy = GenerationType.SEQUENCE)	
	private Integer Id;
	
	private String name;
	private Integer qty;
	private Integer price;
	private Integer totalprice;
	
}
