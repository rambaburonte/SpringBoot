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
@Table(name="s14220")
public class Student {

	
	
	
	@Id
	@SequenceGenerator(name="seq1",initialValue = 1001, allocationSize = 1,sequenceName = "Sseq")
	@GeneratedValue(generator = "seq1",strategy = GenerationType.SEQUENCE)
	private Integer sid;

	private String sname;
	
	private String sadd;
	
	
	@ManyToMany(cascade = CascadeType.ALL,targetEntity =  Faculty.class,fetch = FetchType.EAGER)
	@JoinTable(name= "fact01" , joinColumns = @JoinColumn(name="Student_id",referencedColumnName = "sid"),
	inverseJoinColumns = @JoinColumn(name="Faculty_id",referencedColumnName = "fid"))
	private Set<Faculty> facInfo;
	
	
	
	
	
}
