package com.rs.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.rs.entity.CallerTune;
import com.rs.service.ICallerTuneService;

@Component
public class CallerTuneRunner implements CommandLineRunner {
	
	
	
	@Autowired
	private ICallerTuneService cs; 
	
	
	
	@Override
	public void run(String... args) throws Exception {
		
		/*CallerTune ct=new CallerTune();
		ct.setSong("rathhalu rathhalu");
		ct.setMovie("khidi no 150");
		ct.setPhno(9999);*/
		
		/*CallerTune ct=new CallerTune();
		ct.setSong("Kurchi madathapetti");
		ct.setMovie("guntur karam");
		ct.setPhno(8888);*/
		
//		CallerTune ct=new CallerTune();
//		ct.setSong("kisak");
//		ct.setMovie("pushpa");
//		ct.setPhno(7878);
		
	System.out.println(cs.updateCallerTune(1, "oo mama oo antava", "pushpa"));
		
		//System.out.println(cs.setCallerTune());
		
		
	}

	 
	
}
