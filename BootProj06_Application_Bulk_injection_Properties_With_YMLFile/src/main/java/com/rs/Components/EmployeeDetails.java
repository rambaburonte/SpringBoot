package com.rs.Components;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component("ed")
@ConfigurationProperties(prefix ="emp")
public class EmployeeDetails {
		private String ename,add,email;
		
		private String[] favColors;
		private List<String> friends;
		private Set<Long> phone;
		private Map<String,Integer> idDetails;
		@Value("#{cd.sal + cd.sal1 + cd.sal2}")
		private long sum;
		
		

		@Autowired
		private CompanyDetails cd;
}		
		
