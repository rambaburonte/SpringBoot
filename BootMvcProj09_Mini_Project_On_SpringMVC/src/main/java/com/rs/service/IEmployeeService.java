package com.rs.service;

import java.util.List;

import com.rs.entity.EmployeeEntity;

public interface IEmployeeService {
	public List<EmployeeEntity> showAll();
	
	public String addEmp(EmployeeEntity e) ;
	public EmployeeEntity getEmp(int eid);
	public String updateEmp(EmployeeEntity e);
	public String deleteEmp(int eid);

}
