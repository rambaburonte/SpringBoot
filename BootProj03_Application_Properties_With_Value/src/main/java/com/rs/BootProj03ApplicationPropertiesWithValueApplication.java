package com.rs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.PropertySource;

import com.rs.Components.Student;

@SpringBootApplication
//@PropertySource("user.properties")
public class BootProj03ApplicationPropertiesWithValueApplication {

	public static void main(String[] args) {
	ApplicationContext	ctx=SpringApplication.run(BootProj03ApplicationPropertiesWithValueApplication.class, args);
		
	
	Student	st1=ctx.getBean("st",Student.class);
	System.out.println(st1);	
	
	}

}
