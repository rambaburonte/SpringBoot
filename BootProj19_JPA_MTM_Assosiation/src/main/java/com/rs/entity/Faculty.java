package com.rs.entity;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@Table(name="f14")
public class Faculty {
	@Id
	@SequenceGenerator(name="seq1",initialValue = 1001, allocationSize = 1,sequenceName = "seq")
	@GeneratedValue(generator = "seq1",strategy = GenerationType.SEQUENCE)
	private Integer fid;
	
	private String name;
	private String cource;
	
	
//	@ManyToMany(targetEntity = Student.class,cascade = CascadeType.ALL,fetch = FetchType.LAZY)
//	@JoinTable(name= "JPA_MTM_FACULTY_STUDENT" , joinColumns = @JoinColumn(name="Faculty_id",referencedColumnName = "fid"),
//	inverseJoinColumns = @JoinColumn(name="students_id",referencedColumnName = "sid"))
	
	@ManyToMany(targetEntity = Student.class,fetch = FetchType.EAGER,cascade = CascadeType.ALL)
	@JoinTable(name="fact01",joinColumns = @JoinColumn(name="Faculty_id",referencedColumnName = "fid"),
	inverseJoinColumns = @JoinColumn(name="Student_id",referencedColumnName = "sid"))
	private Set<Student> students;

}
