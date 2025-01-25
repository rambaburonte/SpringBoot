package com.rs.JobMoniLisener;

import java.util.Date;

import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobExecutionListener;
import org.springframework.stereotype.Component;
@Component
public class JobMonioteringLisener implements JobExecutionListener {

	
	private long stime,etime;
	
	@Override
	public void beforeJob(JobExecution jobExecution) {
		System.out.println("start time "+ new  Date());
		stime=System.currentTimeMillis();
	}

	@Override
	public void afterJob(JobExecution jobExecution) {
		System.out.println("End time " + new Date());
		etime=System.currentTimeMillis();
		System.out.println("job execution status" + jobExecution.getStatus());
		System.out.println("job execution time "+ (etime-stime));
		System.out.println("job exit status " + jobExecution.getExitStatus());
		
	}

}
