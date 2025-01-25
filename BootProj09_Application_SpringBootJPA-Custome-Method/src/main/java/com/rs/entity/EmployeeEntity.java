package com.rs.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;
@Entity
@Table(name="emp1442")
@Data
public class EmployeeEntity {
	
	@Id
	@SequenceGenerator(sequenceName = "s1",initialValue = 1001,allocationSize = 1,name = "se")
	@GeneratedValue(generator = "se", strategy = GenerationType.SEQUENCE)
	private Integer id;
	
	
	@Column(length=50)
	private String ename;
	@Column(length=50)
	private String email;
	
	private Integer sal;
	
}
