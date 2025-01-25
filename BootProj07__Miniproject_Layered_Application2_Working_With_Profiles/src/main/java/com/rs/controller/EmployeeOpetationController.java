package com.rs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.rs.model.EmployeeBean;
import com.rs.service.EmployeeService;

@Controller("regEmp")
public class EmployeeOpetationController {
		@Autowired
		private EmployeeService es;
		public String registerEmp(EmployeeBean eb) throws Exception {
			return es.regEmp(eb);
				
			
		}
		public String deleteEmp(String eid) throws Exception{
			return es.delEmp(eid);
			
			
		}
		public void retriveEmp(String desg1, String desg2, String desg3) throws Exception {
			 List<EmployeeBean> list=es.retriveDetails(desg1, desg2, desg3);
			 for(EmployeeBean e: list) {
				 System.out.println( e.getEmpno() +  "  " + e.getEname() +  " " +e.getSal() + " " + e.getDeptno()  + " " +  e.getComm()   + " " +  e.getDesg()  + " " + e.getHiredate()  + " " + e.getTotalSal()   + " " + e.getGrossal()   + " " + e.getHta());
			 }
			 
		
			
		}
		public void updateEmpSal(String eid,String sal) throws Exception{
			String msg= es.updateEmpSal(eid, sal);
			System.out.println(msg);
		}
		
}
