package com.rs.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.rs.entity.Customer;

@Controller
public class DataRendaringModelObjController {
	
	@Autowired
	private Customer cst; 
	@GetMapping
	public String showHome() {
		return "home";
	}
	/*@GetMapping("model")
	public String modelObj(Map<String,Object> map) {
		cst.setSno(101);
		cst.setSname("ganesh");
		cst.setAdd("hyd");
		cst.setMarks(64);
		
		
		Customer cst1=new Customer();
		cst1.setSno(102);
		cst1.setSname("mahesh");
		cst1.setAdd("chenni");
		cst1.setMarks(45);
		
		Customer cst2=new Customer();
		cst2.setSno(103);
		cst2.setSname("suresh");
		cst2.setAdd("kochi");
		cst2.setMarks(89);
		
		map.put("mdl",List.of(cst,cst1,cst2));
		
		return "model";
	}*/
	@GetMapping("/register")
	public String mapRegister(@ModelAttribute("st") Customer cst) {
		return "form";
	}
	@PostMapping("/register")
	public String registerUser(Map<String,Object> map,@ModelAttribute("stud") Customer cst) {
		map.put("mdl", List.of(cst));
		System.out.println(cst);
		
		return "model";
	}
	

}
