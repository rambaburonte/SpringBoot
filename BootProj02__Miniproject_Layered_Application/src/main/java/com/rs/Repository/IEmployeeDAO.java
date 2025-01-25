package com.rs.Repository;

import java.util.List;

import com.rs.model.EmployeeBean;

public interface IEmployeeDAO {
	public List<EmployeeBean> retriveEmp(String desg1,String desg2,String desg3) throws Exception ;
	public int insertEmp(EmployeeBean eb) throws Exception;
	public int deleteEmp(String eid) throws Exception;
	public int updateEmpSal(String Eid,String Sal ) throws Exception;
}
