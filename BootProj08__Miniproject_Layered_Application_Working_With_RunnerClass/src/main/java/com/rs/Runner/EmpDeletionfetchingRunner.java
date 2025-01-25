package com.rs.Runner;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.rs.controller.EmployeeOpetationController;
@Component
@Order(12)
public class EmpDeletionfetchingRunner implements CommandLineRunner {
	@Autowired
	private EmployeeOpetationController controller;
	Scanner sc = new Scanner(System.in);
	@Override
	public void run(String... args) throws Exception {

		
		System.out.println("enter the empid for delete ");
	     String eid2=sc.nextLine();
	     String msg1 = controller.deleteEmp(eid2);
	 System.out.println(msg1);
	 controller.retriveEmp("Devloper","Software Engineer","SALESMAN");

	}

}
