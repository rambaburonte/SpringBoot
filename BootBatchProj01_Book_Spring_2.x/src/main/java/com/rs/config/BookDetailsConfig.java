package com.rs.config;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.rs.JobMoniLisener.JobMonioteringLisener;
import com.rs.processer.BookDeilsProcesser;
import com.rs.reader.BookDetailsReder;
import com.rs.writer.BookDetailsWriter;

@Configuration
@EnableBatchProcessing
public class BookDetailsConfig {
	@Autowired
	private  JobBuilderFactory jbf;
	@Autowired
	private StepBuilderFactory sbf;
	
	@Autowired
	private JobMonioteringLisener lisener;
	@Autowired
	private BookDeilsProcesser processer;
	
	@Autowired
	private BookDetailsReder reader;
	@Autowired
	private BookDetailsWriter writer;
	
	@Bean(name="step1")
	public Step createSteap() {
		System.out.println("BookDetailsConfig.createSteap()");
		return sbf.get("step1")
				.<String,String>chunk(2)
				.reader(reader)
				.processor(processer)
				.writer(writer).build();
		}
	
	@Bean(name="job1")
	public Job createJob() {
		System.out.println("BookDetailsConfig.createJob()");
		
		return jbf.get("job1").listener(lisener).incrementer(new RunIdIncrementer()).start(createSteap()).build();
		
		
		
		
		
		
	}






}
























