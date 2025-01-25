package com.rs.service;

import com.rs.entity.CallerTune;

public interface ICallerTuneService {
	
	public String setCallerTune(CallerTune ct);
	
	public String updateCallerTune(Integer id,String CallerTune,String movie);
	
}
