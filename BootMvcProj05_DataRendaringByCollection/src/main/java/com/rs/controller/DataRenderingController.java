package com.rs.controller;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DataRenderingController {
	@GetMapping
	public String showHome() {
		return "home";
	}
	@GetMapping("/colors")
	public String showColors(Map<String,Object> map) {
		String[] colors= {"red","blue","yellow","pink"};	
	
		map.put("colors", colors);
		return "colors";
	}
	
	@GetMapping("/friends")
	public String showFriends(Map<String,Object> map) {
		
		map.put("friends",List.of("anil","mahesh","sunil","bindu") );
		
		return "friends";
	}
	@GetMapping("/phones")
	public String showAllPhones(Map<String,Object> map) {
		map.put("phones",Set.of(99999,8888,777777,5555555));
		
		return "phones";
		
	}
	@GetMapping("/ids")
	public String showAllIds(Map<String,Object> map) {
		map.put("ids",Map.of("adhar",151515,"voterId",458664,"pan",45112));
		
		return "ids";
	}
	
	
}
