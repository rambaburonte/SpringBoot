package com.rs.service;

import com.rs.entity.Doctor;

public interface IDoctorServiceMng {
	
	public String registerDoctor(Doctor dt);
	public int findAgeById(Integer id);

}
