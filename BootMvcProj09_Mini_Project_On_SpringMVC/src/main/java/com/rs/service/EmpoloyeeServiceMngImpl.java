package com.rs.service;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
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
	@Override
	public EmployeeEntity getEmp(int eid) {
		Optional<EmployeeEntity> opt=	erepo.findById(eid);
		if(opt.isPresent()) {
			return opt.get();
		}
		throw new IllegalArgumentException("Invalid ID: " + eid);
	}
	@Override
	public String updateEmp(EmployeeEntity e) {
		Optional<EmployeeEntity> opt=	erepo.findById(e.getId());
		if(opt.isPresent()) {
			//EmployeeEntity e1= opt.get();
			erepo.save(e);
			return e.getId() + " Employee Updated ";
		}
		throw new IllegalArgumentException("Invalid ID: " +e.getId());
		
	}
	@Override
	public String deleteEmp(int eid) {
		EmployeeEntity e=getEmp(eid);
		erepo.delete(e);
		return "Employee deleted with " + eid;
	}

}
