package com.rs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rs.entity.Product;
import com.rs.repo.IProductRepo;
@Service
public class ProductMngService implements IProductMngService {

	
	@Autowired
	private IProductRepo pr;
	

	@Override
	public String addPrductDetails(Product p) {
		
		String  pm=pr.save(p).getId();
		
		return " Product is saved id with  " + pm;
	}
	@Override
	public List<Product> retriveAllRecords() {
		return pr.findAll();
		
	}
	@Override
	public  List<Product> addAllProducts(List<Product> p) {
		return pr.saveAll(p);
	}
	@Override
	public List<Product> retriveAllPriceBetween(Integer start, Integer end) {
		
		return pr.findAllByPriceBetween(start, end);
	}
	@Override
	public List<Object[]> getProductsByCtry(String ctry) {
		
		return pr.getProductsByCtry(ctry);
	}
	@Override
	public List<Product> retriveAllWithMade(String country) {
		
		return pr.retriveAllWithMade(country);
	}
}
