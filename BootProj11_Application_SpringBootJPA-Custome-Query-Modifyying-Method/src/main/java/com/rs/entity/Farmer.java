package com.rs.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;
@Data
@Entity
@Table(name="Farmer")
public class Farmer {
	
	@Id
	@SequenceGenerator(sequenceName = "sq7" , initialValue = 101,allocationSize = 1,name="f1")
	@GeneratedValue(generator = "f1" , strategy=GenerationType.SEQUENCE)
	private Integer id;
	@Column(length=50)
	private String name;
	@Column(length=50)
	private String add;
	@Column(length=50)
	private String crop;
	private Integer value;
}
