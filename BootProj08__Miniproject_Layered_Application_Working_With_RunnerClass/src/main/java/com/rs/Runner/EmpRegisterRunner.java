package com.rs.Runner;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.rs.controller.EmployeeOpetationController;
import com.rs.model.EmployeeBean;
@Component
@Order(10)
public class EmpRegisterRunner implements CommandLineRunner ,Ordered{
	@Autowired
	private EmployeeOpetationController controller;
	Scanner sc = new Scanner(System.in);
	@Override
	public void run(String... args) throws Exception {
		
		EmployeeBean eb=new EmployeeBean();
		
		
		System.out.println("Enter the ename ");
		String ename= sc.nextLine();
		eb.setEname(ename);
		System.out.println("Enter the job ");
		String job= sc.nextLine(); 	eb.setDesg(job);
		System.out.println("Enter the mgrid ");
		String mgrid= sc.nextLine(); eb.setMgr(mgrid);
		System.out.println("Enter the hiredate ");
		String hiredate= sc.nextLine();
		eb.setHiredate(hiredate);
		System.out.println("Enter the sal ");
		String sal= sc.nextLine();
		eb.setSal(sal);
		System.out.println("Enter the comm ");
		String comm= sc.nextLine();
		eb.setComm(comm);
		System.out.println("Enter the deptno ");
		String deptno= sc.nextLine();
		eb.setDeptno(deptno);
	
	 String msg=controller.registerEmp(eb);
	     System.out.println(msg);
	

	}
	@Override
	public int getOrder() {
		
		return 20;
	}
	
}
