package com.rs.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.rs.entity.EmployeeEntity;
import com.rs.sevice.IEmployeeMng;
@Component
public class EmpRunner implements CommandLineRunner {
	@Autowired
	private IEmployeeMng es;
	@Override
	public void run(String... args) throws Exception {
		
		
		//es.findByname("rajesh").forEach(System.out::println);
		//es.findByNameStartingWith("r").forEach(System.out::println);
		//es.findByEnameEndingWith("sh").forEach(System.out::println);
		
		//es.findByEnameContains("%e%").forEach(System.out::println);
		
		//System.out.println("----------------");
		//es.findByEnameLike("%e%").forEach(System.out::println);
		
		
		
		//es.findBySalBetween(1000, 10000).forEach(System.out::println);
		
		
		//es.findBySalBetweenEnameStartingWith(1000,10000,"r").forEach(System.out::println);
		
		//es.findBySalGreterThan(4000).forEach(System.out::println);
		
		EmployeeEntity e=new EmployeeEntity();
		e.setEname("mahesh");
		e.setEmail("m@gmail.com");
		e.setSal(14521);
		
		es.insertRecord(e).toString();
		
	}

}
