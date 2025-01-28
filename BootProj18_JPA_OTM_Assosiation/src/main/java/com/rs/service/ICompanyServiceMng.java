package com.rs.service;

import java.util.List;
import java.util.Set;

import com.rs.entity.Department;
import com.rs.entity.Employee;

public interface ICompanyServiceMng {
	
	public String insertRecordByDept(Department d); // from parent

	
	public String insertRecordByEmp(Set<Employee> s); // child
	
	public void  retriveAllDept(); //from parent
	public List<Employee> retriveAllEmpWithDept();  // from child
	
	public String removeDeptAndEmps(int deptno);
	
	public String removeAllEmpsAndDept(List<Integer> l);
	
	public String addNewEmpToDept(Employee e,int dno);	
	
	public String removeAllEmpFromDept(int dno);
	
	public String removeOneEmpInDept(int eno);
	
	public List<Object[]> fetchDetailsFromTwoTables();
}
	