package edu.test.servlet;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MyIntroduce implements Servlet {
							
	ServletConfig config;
	
	@Override
	public void init(ServletConfig config)		
			throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("init 호출");
		
		this.config = config;
	}
	
	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		System.out.println("getServletConfig 호출");
		
		return this.config;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		System.out.println("getServletInfo 호출됨");
		
		return "";
	}
	
	@Override
	public void service(ServletRequest req, ServletResponse res) 
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("안녕하십니까. 유 효준입니다.");
		System.out.println("자바 API반을 수강하고 있는 학생입니다.");
		System.out.println("잘 부탁드립니다.");
	}	
	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("destroy 호출");
	}

	

	
	
}
