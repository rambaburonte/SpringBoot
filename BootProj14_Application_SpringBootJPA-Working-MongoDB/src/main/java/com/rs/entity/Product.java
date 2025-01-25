package com.rs.entity;

import java.util.UUID;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document
@Data
public class Product {
	@Id
	private String id;
	private String pname;
	private Integer price; 
	private String ctgry;
	private String rating;
	private String dictription;
	private String madeIn;
	
}
