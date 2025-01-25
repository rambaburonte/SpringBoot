package com.rs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rs.entity.VegEntity;
import com.rs.repo.IVegRepo;
@Service
public class VegServivce implements IVegMngServ {
	@Autowired
	private IVegRepo vr;
	
	@Override
	public List<VegEntity> findAll() {
		
		return vr.findAllQ();
	}
	@Override
	public List<VegEntity> findByQtyMorethan(Integer qty) {
		
		return vr.findAllByQtyMorethan(qty);
	}
	@Override
	public List<VegEntity> findAllByPriceCatogity(Integer p1, Integer p2) {
		
		return vr.findAllByPriceCatogity(p1, p2);
	}
	@Override
	public List<Object[]> findVegNamesPricesMoreTQrt(Integer qty) {
		
		return vr.findVegNamesPricesMoreTQrt(qty);
	}@Override
	public List<String> findAllVegNames() {
		return vr.findAllVegNames();
	}
	@Override
	public VegEntity findVegByName(String name) {
		
		return vr.findVegByName(name);
	}
	@Override
	public Object findVegPriceQty(String name) {
		
		return vr.findVegPriceQty(name);
	}
	@Override
	public int countingUniqePrices() {
		
		return vr.countingUniqePrices();
	}
@Override
public Object calInVeg() {

	return vr.calInVeg();
}
@Override
public int updateCropValue(Integer price, String crop) {
	
		int count = vr.updateCropValue(price,crop);
		return count ;

	
	}
}
