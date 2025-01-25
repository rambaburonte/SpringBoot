package com.rs.entity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import lombok.Data;

@SuppressWarnings("serial")
@Entity
@Data
public class Matrimony  implements Serializable {
	
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	private Integer id;
	
	private String name;
	
	private String addrs;
	private Integer age;
	@Lob
	private char[] bioData;
	@Lob
	private byte[] pic;
	
	
	

}
