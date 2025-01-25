package com.rs.runners;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.rs.entity.Doctor;
import com.rs.service.IDoctorServiceMng;
@Component
public class DoctorRunner implements CommandLineRunner {

	@Autowired
	private IDoctorServiceMng ds;
	
	
	
	
	
	@Override
	public void run(String... args) throws Exception {
		
//		Doctor d=new Doctor();
//		d.setName("mahesh");
//		d.setSpl("cardio");
//		d.setFeee(14520);
//		d.setDob(LocalDate.of(1995,8, 15));
//		d.setTob(LocalTime.of(12,45));
//		d.setDoj(LocalDateTime.of(2018,8,27,14,45));	
		
		Doctor f=new Doctor();
		f.setDob(LocalDate.of(84,4,15));
		f.setDoj(LocalDateTime.of(45,5,4,12,48));
		f.setName("ninesh");
		f.setFeee(4521);
		f.setSpl("nuro");
		f.setTob(LocalTime.of(4,50));
		
		String msg = ds.registerDoctor(f);
		System.out.println(msg);
		
		
//		String msg=ds.registerDoctor(d);
//		System.out.println(msg);
		
		
//		System.out.println(ds.findAgeById(2));
		
	}

}
