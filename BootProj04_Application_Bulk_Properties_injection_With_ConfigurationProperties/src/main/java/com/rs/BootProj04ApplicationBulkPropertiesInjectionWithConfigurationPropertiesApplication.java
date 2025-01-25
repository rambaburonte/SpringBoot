package com.rs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.rs.components.Employee;

@SpringBootApplication
public class BootProj04ApplicationBulkPropertiesInjectionWithConfigurationPropertiesApplication {

	public static void main(String[] args) {
		ApplicationContext ctx= SpringApplication.run(BootProj04ApplicationBulkPropertiesInjectionWithConfigurationPropertiesApplication.class, args);
			Employee ed=ctx.getBean("ed" , Employee.class);
			System.out.println(ed);
	
	}

}
