package com.rs.entity;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class Customer {

	private Integer sno;
	private String sname;
	private String add;
	private Integer marks;
	
}
