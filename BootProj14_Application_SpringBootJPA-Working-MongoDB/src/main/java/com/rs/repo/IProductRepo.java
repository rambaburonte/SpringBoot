package com.rs.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.rs.entity.Product;

public interface IProductRepo extends MongoRepository<Product, String> {
	
	public List<Product> findAllByPriceBetween(Integer start,Integer end);
	@Query(fields = "{pname:1,price:1,ctgry:1}",value = "{ctgry:?0}")
	public List<Object[]>  getProductsByCtry(String ctry);

	/*@Query(fields = "{}",value ="{madeIn:?0}")*/
	@Query(value ="{madeIn:?0}")
	public List<Product> retriveAllWithMade(String country);
	
}
