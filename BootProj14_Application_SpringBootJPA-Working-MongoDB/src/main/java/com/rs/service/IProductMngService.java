package com.rs.service;

import java.util.List;

import com.rs.entity.Product;

public interface IProductMngService {
	public String addPrductDetails(Product p);
	public List<Product> retriveAllRecords();
	public List<Product> addAllProducts(List<Product> p);
	
	public List<Product> retriveAllPriceBetween(Integer start,Integer end);
	public List<Object[]>  getProductsByCtry(String ctry);
	public List<Product> retriveAllWithMade(String country);
	
}
