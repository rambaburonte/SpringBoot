package com.rs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.rs.Components.EmployeeDetails;
@SuppressWarnings("unused")
@SpringBootApplication
public class BootProj06ApplicationBulkInjectionPropertiesWithYmlFileApplication {

	public static void main(String[] args) {
	ApplicationContext	ctx=SpringApplication.run(BootProj06ApplicationBulkInjectionPropertiesWithYmlFileApplication.class, args);
	
	EmployeeDetails ed1=ctx.getBean("ed",EmployeeDetails.class);
	System.out.println(ed1);
	
	
	}

}
