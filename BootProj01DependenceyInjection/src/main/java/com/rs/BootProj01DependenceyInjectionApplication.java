package com.rs;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.rs.service.SeasonFinder;

@SpringBootApplication
public class BootProj01DependenceyInjectionApplication {

	@Bean(name="ld")
	public LocalDate ld() {
		return LocalDate.now();
	}
	
	
	
	public static void main(String[] args) {
		ApplicationContext ctx =SpringApplication.run(BootProj01DependenceyInjectionApplication.class,args);
		SeasonFinder sf=ctx.getBean("sf",SeasonFinder.class);
		String msg=sf.getSeason("   Ram ");
		System.out.println(msg);
	}

}
