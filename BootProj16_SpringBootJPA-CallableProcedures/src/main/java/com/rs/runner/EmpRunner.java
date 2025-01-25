package com.rs.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.rs.service.EmpServiceClass;
@Component
public class EmpRunner implements CommandLineRunner {
	@Autowired
	private EmpServiceClass es;
	
	
	
	
	
	@Override
	public void run(String... args) throws Exception {
		
		es.retriveRecordBySalRange(4000, 10000).forEach(System.out::println);
	}

}
