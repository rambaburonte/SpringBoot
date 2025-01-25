package com.rs.controller;

import java.util.HashMap;
import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ExtendedModelMap;
import org.springframework.validation.support.BindingAwareModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeCntrl {

	
	@RequestMapping("/home")
	public String welcomeHM(BindingAwareModelMap map) {
		map.put("name","Rambabu");
		map.put("phone",new Random().nextLong(999999999));
				
		return "welcome";
	}
	
	
}
