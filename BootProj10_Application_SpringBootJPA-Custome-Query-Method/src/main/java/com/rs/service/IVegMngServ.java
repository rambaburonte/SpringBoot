package com.rs.service;

import java.util.List;

import org.springframework.data.repository.query.Param;

import com.rs.entity.VegEntity;

public interface IVegMngServ {
	public List<VegEntity> findAll();
	public List<VegEntity> findByQtyMorethan(Integer qty);
	public List<VegEntity> findAllByPriceCatogity(Integer p1,Integer p2);
	
	public List<Object[]> findVegNamesPricesMoreTQrt(Integer qty);
	public List<String> findAllVegNames();
	public VegEntity findVegByName(String name);
	public Object findVegPriceQty(String name);

	public int countingUniqePrices();
	
	public Object calInVeg();
	
	public int updateCropValue(Integer price,String crop);
}
