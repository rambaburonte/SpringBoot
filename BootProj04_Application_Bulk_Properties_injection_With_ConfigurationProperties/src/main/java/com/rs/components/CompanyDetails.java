package com.rs.components;

import org.springframework.stereotype.Component;

import lombok.Data;

@SuppressWarnings("unused")
@Data 

public class CompanyDetails {
	
	private String companyName;
	
	private String desg;
	
	private Double sal;
	
	private String branch;

}
