package com.rs.controller;

import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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
	public String editProfile(@RequestParam("no") Integer id,@ModelAttribute("e") EmployeeEntity e) {
		EmployeeEntity emp1=emps.getEmp(id);
		BeanUtils.copyProperties(emp1,e);
		
		return "edit_js_form";
	}
	
	@PostMapping("/edit")
	public String updateProfile(@ModelAttribute("emp") EmployeeEntity emp,RedirectAttributes at) {
		
		String msg=emps.updateEmp(emp);
		at.addFlashAttribute("msg",msg);
		return "redirect:report";
		
		
		
	}
	@GetMapping("/delete")
	public String deleteEmp(@RequestParam("no") Integer num,RedirectAttributes at) {
		String msg=emps.deleteEmp(num);
		
		at.addFlashAttribute("msg",msg);
		return "redirect:report";
	}
	@GetMapping("/add")
	public String saveEmp(@ModelAttribute("e") EmployeeEntity e) {
		return "reg_form";
			
	}
	
	@PostMapping("/add")
	public String registerEmp(@ModelAttribute("e") EmployeeEntity e,RedirectAttributes att) {
		String msg=emps.addEmp(e);
		//att.addFlashAttribute("eList",emps.showAll());
		att.addFlashAttribute("msg",msg);
		return "redirect:report";
		
	}
	/*@PostMapping("/add")
	public String registerEmp(@ModelAttribute("e") EmployeeEntity e,HttpSession att) {
		String msg=emps.addEmp(e);
		//att.addFlashAttribute("eList",emps.showAll());
		att.setAttribute("msg",msg);
		return "redirect:report";
		
	}*/
	

}
