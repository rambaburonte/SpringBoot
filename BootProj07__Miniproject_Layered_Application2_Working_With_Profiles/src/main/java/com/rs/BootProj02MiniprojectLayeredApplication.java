package com.rs;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.rs.controller.EmployeeOpetationController;
import com.rs.model.EmployeeBean;

@SpringBootApplication
public class BootProj02MiniprojectLayeredApplication {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) throws Exception {
		ApplicationContext ctx=SpringApplication.run(BootProj02MiniprojectLayeredApplication.class, args);
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
		
	 EmployeeOpetationController cntrl =ctx.getBean("regEmp",EmployeeOpetationController.class);
	 
	 String msg=cntrl.registerEmp(eb);
	     System.out.println(msg);
	     System.out.println("enter the empid for delete ");
	     String eid2=sc.nextLine();
	     String msg1 = cntrl.deleteEmp(eid2);
	 System.out.println(msg1);
	 
	 
	 cntrl.retriveEmp("Devloper","Software Engineer","SALESMAN");

	 
	 
	}

}
