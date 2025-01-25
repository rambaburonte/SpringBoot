package com.rs.service;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;
@Service
public class WishMessageGenServiceMngImpl implements IWishMessageGenService {

	@Override
	public String msgGenerator() {
	LocalDateTime ldt=LocalDateTime.now();
	int hour=ldt.getHour();
	if(hour>=3 && hour <= 12)
		return "Good Morning";
	else if(hour>=13 && hour <=15) 
		return "Good AfterNoon";
	else if(hour>=16 && hour<=20)
		return "Good Evining";
	else
		return "Good Night";
	
	}

}
