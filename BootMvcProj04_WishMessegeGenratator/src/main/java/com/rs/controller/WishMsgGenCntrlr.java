package com.rs.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rs.service.IWishMessageGenService;


@Controller
@RequestMapping("/main")
public class WishMsgGenCntrlr {
	@Autowired
	private IWishMessageGenService s;
	
	@GetMapping
	public String showHome(Map<String,Object> map) {
		map.put("msg",s.msgGenerator());
		
		return "welcome";
	}
	
	@GetMapping("/wmg")
	public String wishMsg(Map<String,Object> map) {
		map.put("msg1",s.msgGenerator());
		return "wmg";
	}
	@PostMapping("/wmg")
	public String wishMsgPost(Map<String,Object> map) {
		map.put("msg1",s.msgGenerator());
		return "wmg";
	}
	
	
}
