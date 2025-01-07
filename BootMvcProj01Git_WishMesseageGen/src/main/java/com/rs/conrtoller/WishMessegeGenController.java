package com.rs.conrtoller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WishMessegeGenController {
	
	@GetMapping
	public String shoeHome() {
		
		return "home";
	}

}
