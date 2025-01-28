package com.rs.entity;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="JPA_OTM_DEPT")
@Setter
@Getter
public class Department {
	
	
	@Id
	@SequenceGenerator(name="s1",sequenceName = "OTM_DEPT_SEQ",initialValue = 1,allocationSize = 1)
	@GeneratedValue(generator = "s1",strategy = GenerationType.SEQUENCE)
	private Integer did;
	
	private String dname;
	
	private String loc;
	@OneToMany(cascade=CascadeType.ALL,targetEntity = Employee.class,fetch = FetchType.EAGER)
	@JoinColumn(name="deptno",referencedColumnName = "DID")
	private Set<Employee> e;
	@Override
	public String toString() {
		return "Department [did=" + did + ", dname=" + dname + ", loc=" + loc + "]";
	}
	
	
	public Department() {
			System.out.println("Department. 0 arg");
	}

}
