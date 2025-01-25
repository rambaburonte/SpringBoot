package com.rs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rs.entity.Matrimony;
import com.rs.repository.IMatrimonyRepo;
@Service
public class MatrimonyServiceMng {
		@Autowired
		private IMatrimonyRepo mr;
	
	
		public String insertRecord(Matrimony e) {
			int id=mr.save(e).getId();
			return "record inserted with"  + id;
			
		}
		public List<Matrimony> retriveAllRecord(){
			
			return mr.findAll();
			
		}
}
