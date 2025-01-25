package com.rs.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.rs.entity.EmployeeEntity;

public interface IEmployee extends JpaRepository<EmployeeEntity,Integer> , CrudRepository<EmployeeEntity, Integer> {

	public List<EmployeeEntity> findByEname(String name);
	
	public List<EmployeeEntity> findByEnameStartingWith(String name);	
	
	public List<EmployeeEntity> findByEnameEndingWith(String chars);
	
	public List<EmployeeEntity> findByEnameContains(String chars);
	public List<EmployeeEntity> findByEnameLike(String chars);
	
	public List<EmployeeEntity> findBySalBetween(Integer satrt,Integer end);
	
	public List<EmployeeEntity> findBySalBetweenAndEnameStartingWith(Integer satrt,Integer end,String chars);
	
	
	public List<EmployeeEntity> findBySalGreaterThan(Integer sal);
	
}
