package com.rs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rs.entity.Farmer;
import com.rs.repo.IFarmerRepo;

@Service
public class FarmerServiceMng implements IFarmerServiceMng {
	@Autowired
	private IFarmerRepo repo;
	
	@Override
	public String updateCropValue(String cname, Integer per) {
		
		List<Farmer> obj=repo.findByCrop(cname);
		if(obj.isEmpty() == false) {
			int count = repo.updateCropValue(cname, per);
			return count + "  row are updated ";
			
		}
		
		return "no crops are found  ";
	}
@Override
public int deleteByCrop(String crop) {
	return  repo.deleteByCrop(crop);
	
}
}
