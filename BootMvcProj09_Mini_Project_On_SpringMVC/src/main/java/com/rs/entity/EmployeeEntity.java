package com.rs.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="EMP1442")
public class EmployeeEntity {
	
	@Id
	@Column(name="ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(name="ENAME")
	private String name;
	
	@Column(name="SAL")
	private Integer sal;
	
	@Column(name="EMAIL")
	private String mail;
	
		
	
	
}

