package com.rs.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="JPA_OTM_EMP")
@Setter
@Getter
public class Employee {

	@Id
	@SequenceGenerator(name="e",sequenceName = "jpa_otm_emp_seq",initialValue = 1,allocationSize = 1)
	@GeneratedValue(generator = "e",strategy = GenerationType.SEQUENCE)
	private Integer eid;
	
	private String name;
	private Integer sal;
	
	@ManyToOne(targetEntity=Department.class,cascade=CascadeType.ALL)
	@JoinColumn(name="deptno",referencedColumnName = "DID")
	private Department deptno;
	
	public Employee() {
		System.out.println("Employee. 0 arg");
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", sal=" + sal + "]";
	}
	
}
