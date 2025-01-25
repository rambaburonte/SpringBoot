package com.rs.sevice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rs.entity.EmployeeEntity;
import com.rs.repo.IEmployee;

@Service
public class EmployeeMng implements IEmployeeMng {
	@Autowired
	private IEmployee er;
	
	@Override
	public List<EmployeeEntity> findByname(String name) {
		return er.findByEname(name);

	}
	@Override
	public List<EmployeeEntity> findByNameStartingWith(String chars) {
		return er.findByEnameStartingWith(chars);
		
	}
	@Override
	public List<EmployeeEntity> findByEnameEndingWith(String chars) {
		
		return er.findByEnameEndingWith(chars);
	}
	@Override
	public List<EmployeeEntity> findByEnameContains(String chars) {
		
		return er.findByEnameContains(chars);
	}
	@Override
	public List<EmployeeEntity> findByEnameLike(String chars) {
				return er.findByEnameLike(chars);
	}
	@Override
	public List<EmployeeEntity> findBySalBetween(Integer satrt, Integer end) {
		
		return er.findBySalBetween(satrt, end);
	}
	@Override
	public List<EmployeeEntity> findBySalBetweenEnameStartingWith(Integer satrt, Integer end, String chars) {
		
		return er.findBySalBetweenAndEnameStartingWith(satrt, end, chars);
	}
	@Override
	public List<EmployeeEntity> findBySalGreterThan(Integer sal) {
		
		return er.findBySalGreaterThan(sal);
	}
	@Override
	public EmployeeEntity insertRecord(EmployeeEntity e) {
		
		return er.save(e);
	}
}
