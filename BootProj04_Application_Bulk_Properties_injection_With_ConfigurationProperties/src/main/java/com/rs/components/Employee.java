package com.rs.components;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;


@Data
@Component("ed")
@ConfigurationProperties(prefix="user.pro")
public class Employee {
	@Value("${r.ename}")
	private String ename;
	
	private String email;
	
	private String add;
	
	private String[] loc;
	
	private List<String> friends;
	
	private Set<Long> phone;
	
	private Map<String,Integer> idDetails;
	
	private CompanyDetails companayDetails;
	
	
	
}
