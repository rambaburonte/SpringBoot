package com.rs.writer;

import java.util.List;

import org.springframework.batch.item.ItemWriter;
import org.springframework.stereotype.Component;
@Component
public class BookDetailsWriter implements ItemWriter<String> {

	@Override
	public void write(List<? extends String> items) throws Exception {
		items.forEach(System.out::println);
	}

}
