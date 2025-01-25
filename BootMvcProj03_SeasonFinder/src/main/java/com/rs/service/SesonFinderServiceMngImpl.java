package com.rs.service;

import java.time.LocalDate;

import org.springframework.stereotype.Service;
@Service
public class SesonFinderServiceMngImpl implements ISesonFinderServiceMng {

	@Override
	public String sesonFinder() {
		LocalDate ld=LocalDate.now();		
		int month=ld.getMonthValue();
		if(month>=3 && month<=10) 
			return "Rainy season";
		else if(month>=11 || month<=2) 
			return "Winter Season";
		else
			return "Summer Season";
	
	}

}
