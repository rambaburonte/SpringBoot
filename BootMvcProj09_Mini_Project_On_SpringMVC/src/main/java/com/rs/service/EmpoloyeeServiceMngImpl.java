package com.rs.service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rs.entity.EmployeeEntity;
import com.rs.repository.IEmployeeRepo;
@Service
public class EmpoloyeeServiceMngImpl implements IEmployeeService {

	@Autowired
	private IEmployeeRepo erepo;
	
	@Override
	public List<EmployeeEntity> showAll() {
	List<EmployeeEntity> list=erepo.findAll();
	 return list.stream()
             .sorted(Comparator.comparing(EmployeeEntity::getName))
             .collect(Collectors.toList());
	}
	@Override
	public String addEmp(EmployeeEntity e) {
		int id  =erepo.save(e).getId();
		
		return " Employee record is saved with " + id;
	}

}
