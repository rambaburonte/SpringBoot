package com.rs.Components;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component("cd")
@ConfigurationProperties(prefix = "emp.cd")
public class CompanyDetails {
	
	private String cname,location,desg,sal;
	private Integer sal1,sal2,sal3;
	
}
