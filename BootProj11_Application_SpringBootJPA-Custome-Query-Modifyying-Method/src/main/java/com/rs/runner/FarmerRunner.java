package com.rs.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.rs.entity.Farmer;
import com.rs.repo.IFarmerRepo;
import com.rs.service.IFarmerServiceMng;

@Component
public class FarmerRunner implements CommandLineRunner {
	@Autowired
	private IFarmerServiceMng fs;

	
	@Autowired
	private IFarmerRepo repo;
	
	
	
	@Override
	public void run(String... args) throws Exception {
		

//		Farmer f=new Farmer();
//		f.setName("Ramesh");
//		f.setAdd("bgm");
//		f.setCrop("paddy");
//		f.setValue(2300);
//		
//		
//		repo.save(f);
//		
		
//	String msg= fs.updateCropValue("paddy", 10);
//	System.out.println(msg);
		
//		int coubt = fs.deleteByCrop("cotton");
//		
//		System.out.println(coubt + " rows deleted");.
		int coubt =repo.creat1table();
		System.out.println(coubt+ "  table created");
		
	}
	
	
}
