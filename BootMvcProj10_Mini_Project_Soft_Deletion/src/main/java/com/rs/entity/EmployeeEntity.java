package com.rs.entity;


import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.SQLRestriction;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="EMP1442")
@SQLDelete(sql="UPDATE emp1442 SET status='inactive' WHERE id=?")
@SQLRestriction("STATUS != 'inactive'")
public class EmployeeEntity {
	
		@Id
		@Column(name="ID")
		@SequenceGenerator(sequenceName = "emp_seq1",initialValue = 1011,allocationSize = 1,name="seq1")
		@GeneratedValue(generator = "seq1",strategy =  GenerationType.AUTO)
		/*@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequence_name")
	@SequenceGenerator(name = "sequence_name",initialValue = 1020,allocationSize = 1, sequenceName = "YOUR_SEQUENCE_NAME")*/
	private Integer id;
	
	@Column(name="ENAME")
	private String name;
	
	@Column(name="SAL")
	private Integer sal;
	
	@Column(name="EMAIL")
	private String mail;
	private String status="active";
		
	
	
}

