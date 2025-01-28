package com.rs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rs.entity.Faculty;
import com.rs.repo.IFacultyRepo;

@Service
public class ServiceInstuteMang implements IServiceInstutemng {

	
	@Autowired
	private IFacultyRepo fr;
	
	@Override
	public Faculty saveDataByParemt(Faculty f) {
	
		return fr.save(f);
		

	}
}
