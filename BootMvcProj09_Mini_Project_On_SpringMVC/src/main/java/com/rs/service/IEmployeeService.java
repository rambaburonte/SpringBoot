package com.rs.service;

import java.util.List;

import com.rs.entity.EmployeeEntity;

public interface IEmployeeService {
	public List<EmployeeEntity> showAll();
	
	public String addEmp(EmployeeEntity e) ;

}
