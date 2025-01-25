package com.rs.runnner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.rs.service.IProductMngService;
@Component
public class ProductRunner implements CommandLineRunner {

	@Autowired
	private IProductMngService ps;
	
	
	
	
	@Override
	public void run(String... args) throws Exception {
		
		
		/*		Product p=new Product();
				p.setPname("ght");
				p.setPrice(470);
				p.setCtgry("Furniture");
				//p.setRating("3.4*");
				p.setMadeIn("india");
				p.setDictription("Ai inbuild");
				
				
		
				Product r=new Product();
				r.setId(new Random().nextInt(1,2)+" ");
				r.setPname("tfuh");
				r.setPrice(1450);
				r.setCtgry("Electronic");
				r.setRating("3.6*");
			//	r.setMadeIn("United states");
				r.setDictription("Long life");
				
				
				
				
		
				Product q=new Product();
				q.setId(new Random().nextInt(1,2)+" ");
				q.setPname("Table");
				q.setPrice(1600);
				//q.setCtgry("Electronic");
				q.setRating("3.4*");
				q.setMadeIn("india");
			//	q.setDictription("Powerful Ai inbuild & Processer");
				
				
				
				
				ps.addAllProducts(List.of(p,q,r)).forEach(System.out::println);
				
				
			*/	
	//	ps.retriveAllPriceBetween(500,1600).forEach(System.out::println);
	/*	ps.getProductsByCtry("Furniture").forEach(row -> {
			for(Object i: row){
				System.out.println(i);
			}
		});
			*/	
		
		ps.retriveAllWithMade("india").forEach(System.out::println);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
