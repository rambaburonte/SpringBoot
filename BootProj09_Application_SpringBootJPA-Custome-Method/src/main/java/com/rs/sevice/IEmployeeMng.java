package com.rs.sevice;

import java.util.List;

import com.rs.entity.EmployeeEntity;

public interface IEmployeeMng {
	public List<EmployeeEntity>  findByname(String name);
	
	public List<EmployeeEntity> findByNameStartingWith(String chars);
	public List<EmployeeEntity> findByEnameEndingWith(String chars);
	
	public List<EmployeeEntity> findByEnameContains(String chars);
	
	public List<EmployeeEntity> findByEnameLike(String chars);
	
	public List<EmployeeEntity> findBySalBetween(Integer satrt,Integer end);
	public List<EmployeeEntity> findBySalBetweenEnameStartingWith(Integer satrt,Integer end,String chars);
	public List<EmployeeEntity> findBySalGreterThan(Integer sal);
	public EmployeeEntity insertRecord(EmployeeEntity e);
	
}
