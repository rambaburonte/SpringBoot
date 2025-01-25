package com.rs.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rs.service.ISesonFinderServiceMng;

@Controller
public class SesonFinderCntrl {
	@Autowired
	private ISesonFinderServiceMng sfs;
	@RequestMapping
	public String showHome() {
		
		return "welcome";
	}
	@GetMapping("/season")
	public String findSeson(Map<String,Object> map) {
		
		String msg=sfs.sesonFinder();
		map.put("msg",msg);
		return "season";
	}
	

}
