package com.rs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.rs.Repository.IEmployeeDAO;
import com.rs.Repository.OracleEmployeeDAO;
import com.rs.model.EmployeeBean;

@Service
public class EmployeeService {
	@Autowired
	@Qualifier("sql")
	private IEmployeeDAO ed;
			
		public String regEmp(EmployeeBean eb) throws Exception {
			int rc=ed.insertEmp(eb);
			
			return rc > 0 ?  "Emp details registerd" : " Emp details not registerd"; 
			
		
		}
		public String delEmp(String eid) throws Exception {
			int rc=ed.deleteEmp(eid);
			return rc > 0 ? "Employee details deleted" : "Employee details not deleted" ; 
			
			
		}
		public List<EmployeeBean> retriveDetails(String desg1, String desg2, String desg3) throws Exception{
			List<EmployeeBean>	list=ed.retriveEmp(desg1, desg2, desg3);
			for(EmployeeBean e : list) {
				Double bsal=Double.parseDouble(e.getSal());
				Double gross=bsal*0.5;
				Double hra=bsal*0.75 ; 
				Double totalsal = bsal + gross + hra ; 
				e.setHta(hra+"");
				e.setGrossal(gross+"");
				e.setTotalSal(totalsal+"");
			}
			return list;			
			
		}
		public String updateEmpSal(String eid,String sal)  throws Exception{
		int rc = ed.updateEmpSal(eid, sal);
		return rc>0 ? " Salary updated "  : "Salary not updated" ; 
			
			
		}
 		
}
