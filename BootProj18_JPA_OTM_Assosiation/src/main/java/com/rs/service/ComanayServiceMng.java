package com.rs.service;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rs.entity.Department;
import com.rs.entity.Employee;
import com.rs.repository.IDeptRepo;
import com.rs.repository.IEmpRepo;
@Service
public class ComanayServiceMng implements ICompanyServiceMng {
	
	@Autowired
	private IDeptRepo dr;
	@Autowired
	private IEmpRepo er;

	@Override
	public String insertRecordByDept(Department d) {
		
		Department f=dr.save(d);
		System.out.println(f.getDid());
		List<Integer> id=f.getE().stream().map(Employee::getEid).collect(Collectors.toList());
		System.out.println("  Emp Details Register With Thse IDs  ");
		id.forEach(System.out::println);
		return " Dept AND Emp Details Are Sussfully Registered  from dept side";
	}
	@Override
	public String insertRecordByEmp(Set<Employee> s) {
		List<Employee> l=er.saveAll(s);
		
		System.out.println("Emp  rec saved with ");
		l.stream().map(Employee::getEid).forEach(System.out::println);
		System.out.println("Dept no saved with ");
		l.stream().map(Employee::getDeptno).forEach(System.out::println);
		return  " Dept AND Emp Details Are Sussfully Registered  from Emp side" ;
	}
	@Override
	public void retriveAllDept() {
		List<Department> l= dr.findAll();
		System.out.println("department details");
		l.forEach( i-> { System.out.println(i);
		System.out.println("employee details");
		Set<Employee> e=i.getE();
		e.forEach(System.out::println);
	});
		
	
		
		
	}
	@Override
	public List<Employee> retriveAllEmpWithDept() {
		
		return er.findAll();
	}
	@Override
	public String removeDeptAndEmps(int deptno) {
		Optional<Department> opt=dr.findById(deptno);
		if(opt.isPresent()) {
			dr.delete(opt.get());
			return "Department and its emps deleted";
		}
		return "Department Not found";
	}
	@Override
	public String removeAllEmpsAndDept(List<Integer> l) {
		List<Employee> l1=er.findAllById(l);
		if(l1 != null && l1.size() !=0) {
			er.deleteAll(l1);
			return " deleted Depart ment and it's Employees  "; 
					
		}
		
		return "given Employees  not Found ";
	}
	@Override
	public String addNewEmpToDept(Employee e, int dno) {
		Optional<Department> opt=dr.findById(dno);
		if(opt.isPresent()) {
		Department d=	opt.get();
		e.setDeptno(d);
		Set<Employee> i=d.getE();
		i.add(e);
		d.setE(i);
		Department m= dr.save(d);
		
		return "new Employee is added to existing Department";
			
		}
		
		 return "Department is not found";
	}
	@Override
	public String removeAllEmpFromDept(int dno) {
		Optional<Department> opt=dr.findById(dno);
		if(opt.isPresent()) {
			Department d=opt.get();
			Set<Employee> s=d.getE();
			s.forEach(e -> e.setDeptno(null));
			er.deleteAllInBatch(s);
			return dno + " dept Employees all clear ";
			
			
		}
		
		
		return "deptment not found";
	}
	@Override
	public String removeOneEmpInDept(int eno) {
		Optional<Employee> opt=er.findById(eno);
		if(opt.isPresent()) {
			Employee e=opt.get();
			e.setDeptno(null);
			er.deleteAllInBatch(List.of(e));
			return "Emp Deleted";
		}
		
		
		return "Emp not Found";
	}
	
	
	@Override
	public List<Object[]> fetchDetailsFromTwoTables() {
		
		return er.fetchDetailsFromTwoTables();
	}
	
	
	
	
	
	
	
	
	

}
