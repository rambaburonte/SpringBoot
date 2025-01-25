package com.rs.controller;

import java.io.IOException;
import java.io.PrintWriter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServletResponse;

@Controller
public class DataRendaring {
	
	
	/*@RequestMapping("/home")
	public String  showHome(Map<String,Object> map) {
			
		map.put("sysDate",LocalDate.now());
		map.put("name","Rambabu");
		return "redirect:/wel?par1=ram&par2=21";
		
	}
	
	
	@RequestMapping("wel")
	public String showWelcome() {
	
		
		
		
		return "welcome";
	}*/
	
	@Autowired
	private ServletContext sc;
	@Autowired
	private ServletConfig scg;
	
	/*@RequestMapping("/home")
	public String showHome(HttpServletRequest req,HttpServletResponse res) {
		System.out.println(sc.getContextPath());
		System.out.println(scg.getServletName());
		return "welcome";
	}*/
	
	@RequestMapping("/home")
	public void showHome(HttpServletResponse res) throws IOException {
		
		PrintWriter pw= res.getWriter();
		
		
		res.setContentType("text/html");
		res.setHeader("Content-Disposition", "attachment;filename=abc.html");
		
		
		pw.println("this is downloded from browser");
		pw.println("thekjkjbdnkjbs");
		
		
		
		
		
		
		
		
	
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}