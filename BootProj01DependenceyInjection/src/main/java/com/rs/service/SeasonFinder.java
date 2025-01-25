package com.rs.service;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("sf")
public class SeasonFinder {
	@Autowired
	private LocalDate ld;
	
	public String getSeason(String user) {
		int month = ld.getMonthValue();
		System.out.println(month);
	if(month>=6  && month<=10) {
		return "You are in Rinny season" + user;
	}
	else if(month>10 || month<=3) {
		return "You are in Winter" + user;
	}
	else
		return "you are in summer " + user ;
	
	
	}

	
	
	
}
