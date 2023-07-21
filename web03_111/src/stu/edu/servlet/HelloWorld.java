package stu.edu.servlet;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
//java. 이 아니라 javax.이다 확장되었다는 의미다.
public class HelloWorld implements Servlet {
								//Servlet은 인터페이스
	ServletConfig config;
	
	@Override
	public void init(ServletConfig config)		//init이 한 번 수행되면 끝. 서비스만 호출 된다.
			throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("init 호출");
		//new로 객체를 만드는 것이 아니라 이미 정해진 것을 가져온다.
		String str = config.getInitParameter("email");
		
		System.out.println(str);
		
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
		System.out.println("service 호출");
	}	
	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("destroy 호출");
	}

	

	
	
}
