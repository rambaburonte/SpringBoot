package com.rs.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rs.entity.CallerTune;
import com.rs.repo.ICallerTuneRepo;

@Service
public class CallerTuneService implements ICallerTuneService {
	
	@Autowired
	private ICallerTuneRepo cr;
	
	
	
	
		@Override
		public String setCallerTune(CallerTune ct) {
		int id= 	cr.save(ct).getId();
			return " Caller Tune is saved with caller id " + id;
		}
		@Override
		public String updateCallerTune(Integer id, String CallerTune,String movie) {
		Optional<CallerTune> ct1=cr.findById(id);
		if(ct1.isPresent()) {
			CallerTune ct=ct1.get();
			ct.setSong(CallerTune);
			ct.setMovie(movie);
			CallerTune gt= 	cr.save(ct);
				return "Song is update to" + gt.getSong()  + "  "  +gt.getMovie();
		}
		return "No caller tune found";
		
			
		}




}
