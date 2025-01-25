package com.rs.Components;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;
@Data
@Component("cc")
public class CourceColab {
	
	@Value("${cource.java}")
	private Integer javaFee;
	@Value("${cource.oracle}")
	private Integer oracleFee;
	@Value("${cource.ui}")	
	private Integer uiFee;
	@Value("${cource.sbms}")
	private Integer sbmsFee;
	@Value("${cource.python}")	
	private Integer python;
}
