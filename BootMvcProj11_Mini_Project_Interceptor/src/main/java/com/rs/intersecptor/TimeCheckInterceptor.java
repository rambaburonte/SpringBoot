package com.rs.intersecptor;

import java.time.LocalTime;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@Component
public class TimeCheckInterceptor implements HandlerInterceptor {
	
	@Override
	public boolean preHandle(HttpServletRequest req, HttpServletResponse res, Object handler)
			throws Exception {
		LocalTime lt=LocalTime.now();
		int h=lt.getHour();
		if(req.getServletPath().equalsIgnoreCase("/")) 
			return true;
		if(h < 8 || h > 18) {
				RequestDispatcher rd=req.getRequestDispatcher("/timeout.jsp");
				rd.forward(req, res);
				return false;
		}
		
		return true;
	}
}
