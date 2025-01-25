package com.rs.service;

import java.util.List;

import com.rs.entity.Farmer;

public interface IFarmerServiceMng {
	public String updateCropValue(String cname,Integer per);
	public int deleteByCrop(String crop);

	
	
	
}
