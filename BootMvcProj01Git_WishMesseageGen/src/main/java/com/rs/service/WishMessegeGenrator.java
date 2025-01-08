package com.rs.service;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.stereotype.Service;
@Service
public class WishMessegeGenrator implements IWishMessegeGenrator {

	@Override
	public String wishMsgGenrator() {
		LocalDateTime ldt=LocalDateTime.now();
		int hour = ldt.getHour();
		String msg;
		if(hour>=3 && hour<=12)
			msg="Good Mornig";
		else if(hour>12 && hour<16)
			msg="Good Afternoon";
		else if(hour>=16 && hour <=20)
			return "Good Evining";
		else 
			return "Good Night";
		
		return msg;
	}@Override
	public String seasonFinder() {
		LocalDate ld= LocalDate.now();
		int month=ld.getMonthValue();
		String msg=null;
		if(month>=6  && month<=9)
			msg="rainy season";
		else if(month<=5 && month>=3)
			msg= "Summer Season";
		else 
			msg="winter season";
		
		return msg;
	}
}
