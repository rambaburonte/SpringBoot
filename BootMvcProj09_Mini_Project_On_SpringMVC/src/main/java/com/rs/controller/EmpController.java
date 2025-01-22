package com.rs.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

import com.rs.entity.EmployeeEntity;
import com.rs.service.IEmployeeService;

@Controller
public class EmpController {
	@Autowired(required = true)
	private IEmployeeService emps;
	
	@GetMapping
	public String showHome() {
		return "welcome";
	}
	@GetMapping("/report")
	public String showReport(Map<String,Object> map) {
		
		map.put("eList",emps.showAll());
		return "empreport";
	}
	@GetMapping("/edit")
	public String editProfile(@RequestParam Integer id) {
		return "welcome";
	}
	@GetMapping("/add")
	public String saveEmp(@ModelAttribute("e") EmployeeEntity e) {
		
		return "reg_form";
		
		
	}
	

}
