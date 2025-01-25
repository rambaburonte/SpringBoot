package com.rs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rs.entity.Doctor;
import com.rs.repository.IDoctorRepo;
@Service
public class DoctorServiceMng implements IDoctorServiceMng {

	
	@Autowired
	private IDoctorRepo dr;
	
	@Override
	public String registerDoctor(Doctor dt) {
		
		int id=	dr.save(dt).getId();
		
		return " Doctor is saves with id  " + id;
	}
	@Override
	public int findAgeById(Integer id) {
		return  dr.findAgeById(id);
		
	}
	

}
