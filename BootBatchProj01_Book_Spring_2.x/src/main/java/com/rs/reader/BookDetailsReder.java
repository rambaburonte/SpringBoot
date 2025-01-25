package com.rs.reader;

import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;
import org.springframework.stereotype.Component;
@Component
public class BookDetailsReder implements ItemReader<String> {
	
	String[] books= {"GT","Clasic","Bullet","Himalaya","Intersector","Hunter"};
	int count =0;
	
	@Override
	public String read() throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {
		System.out.println("BookDetailsReder.read()");
		if(count < books.length)
			return books[count++];
			
		return null;
	}

	

}
