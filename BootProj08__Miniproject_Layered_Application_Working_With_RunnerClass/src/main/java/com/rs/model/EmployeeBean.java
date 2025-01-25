package com.rs.model;

import java.io.Serializable;

import lombok.Data;
@SuppressWarnings("serial")
@Data
public class EmployeeBean implements Serializable{
	private String empno;
	private String ename;
	private String desg;
	private String mgr;
	private String hiredate;
	private String sal;
	private String comm;
	private String deptno;
	private String grossal;
	private String hta;
	private String totalSal;
	
}
