package com.rs.processer;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;
@Component
public class BookDeilsProcesser implements ItemProcessor<String, String> {

	@Override
	public String process(String item) throws Exception {
		if(item.equalsIgnoreCase("GT"))
			return "Twin Cylinder";
		else if(item.equalsIgnoreCase("Clasic"))
			return "650 cc Clasic Look";
		else if(item.equalsIgnoreCase("bullet"))
			return "Vintage bullet";
		else if(item.equalsIgnoreCase("Himalaya"))
			return "Monten monster Himalaya";
		else if(item.equalsIgnoreCase("Intersector")) 
			return "Mesclenios "+ item;
		else if(item.equalsIgnoreCase("Hunter"))
			return " Forest king of " + item;
		
		return null;
	}



}
