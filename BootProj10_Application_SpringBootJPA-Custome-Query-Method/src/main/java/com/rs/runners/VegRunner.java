package com.rs.runners;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.rs.service.IVegMngServ;
@Component
public class VegRunner implements CommandLineRunner {
	@Autowired
	private IVegMngServ vs;
	
	@Override
	public void run(String... args) throws Exception {
		//vs.findAll().forEach(System.out::println);	
		//vs.findByQtyMorethan(4).forEach(System.out::println);
		
		//vs.findAllByPriceCatogity(30, 40).forEach(System.out::println);
		/*vs.findVegNamesPricesMoreTQrt(4).forEach(row ->{
			for(Object ob:row)
				System.out.print(ob.toString()+"  ");
			System.out.println();
			
		});*/
		
	//	vs.findVegNamesPricesMoreTQrt(5).forEach(row -> System.out.println(Arrays.toString(row)));
	//	vs.findAllVegNames().forEach(System.out::println);
	//	System.out.println(vs.findVegByName("kira"));
	/*Object obj=vs.findVegPriceQty("kira");
	Object[] obja=(Object[])obj;
	for(Object j:obja)
		System.out.print(j + "  ");
	*/
	//	System.out.println("total count Uniqe prices list" + vs.countingUniqePrices());
		
//		Object obj=vs.calInVeg();
//		Object[] obj1=(Object[]) obj;
//		
//		for(Object ob: (Object[]) obj) 
//			System.out.println(ob);
//		
		
		/*System.out.println(" count of all records " +obj1[0]);
		System.out.println(" sum of all prices    " +obj1[1]);
		System.out.println(" min of all prices " +obj1[2]);
		System.out.println(" max of all prices " +obj1[3]);
		System.out.println(" avg of all prices " +obj1[4]);
		System.out.println(" sum of all qtys   "+obj1[5]);*/
		
	System.out.println(vs.updateCropValue(10,"lady Finger"));
	
		
		
	}
	
	

}
