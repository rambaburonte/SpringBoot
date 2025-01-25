package com.rs.Components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;
@Data
@Component("st")
public class Student {
	
	@Value("1001")
	private Integer sno;
	
	
	@Value("${student.name}")
	private String sname;
	@Value("${student.email}")
	private String email;
	@Value("${student.add}")
	private String add;
	
	
	@Value("#{cc.javaFee + cc.oracleFee + cc.sbmsFee}")
	private Integer TotalCorce;
	@Value("#{cc.sbmsFee > 4000}")
	private boolean isSbmsFeeIsHigh;
	
	@Autowired
	private CourceColab cb;
	
	@Value("${os.name}")
	private String OSName;
	@Value("${user.name}")
	private String home;
	@Value("${Path}")
	private String path;
		
	
}
