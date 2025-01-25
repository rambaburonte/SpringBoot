package com.rs.config;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.rs.intersecptor.BrowserCheckInterceptor;
import com.rs.intersecptor.TimeCheckInterceptor;
@Component
public class MyWebMVCConfiguration implements WebMvcConfigurer {
	
	@Autowired
	private TimeCheckInterceptor tci;
	@Autowired
	private BrowserCheckInterceptor bci;
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(tci);
		registry.addInterceptor(bci);
	
	
	}
	
}
