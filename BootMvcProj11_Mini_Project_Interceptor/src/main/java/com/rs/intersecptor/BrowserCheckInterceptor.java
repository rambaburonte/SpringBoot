package com.rs.intersecptor;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class BrowserCheckInterceptor implements HandlerInterceptor{
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		 String userAgent = request.getHeader("User-Agent");
		 System.out.println(userAgent);
		 if(userAgent.contains("Edg") || userAgent.contains("Firefox")) {
			 RequestDispatcher rd=request.getRequestDispatcher("/browser_err.jsp");
		 rd.forward(request, response);
			 return false;
		 
		 }
		return true;
	}

}
