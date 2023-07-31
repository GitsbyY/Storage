package spms.servlets;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

public class AppInitServlet extends HttpServlet{
	
	@Override
	public void init(ServletConfig config) throws ServletException{
		
		System.out.println("AppInitServlet 준비....");
		
		super.init(config);
		
		ServletContext sc = this.getServletContext();
		
		String driver = "";
		String url = "";
		String user = "";
		String password = "";

		Connection conn = null;
		
		try {
				driver = sc.getInitParameter("driver");
				Class.forName(driver);
				
				url = sc.getInitParameter("url");
				user = sc.getInitParameter("user");
				password = sc.getInitParameter("password");
				
				conn = DriverManager.getConnection(url, user, password);
				
				sc.setAttribute("conn", conn);
				
				System.out.println("db연결성공");
			}catch (ClassNotFoundException e) {
				e.printStackTrace();
				// TODO: handle exception
			}catch (SQLException e) {
				e.printStackTrace();
				// TODO: handle exception
			}
	
	}//init
	@Override
	public void destroy() {
		super.destroy();
		System.out.println("AppInitServlet 마무리");
		
		ServletContext sc = this.getServletContext();
		
		Connection conn = (Connection)sc.getAttribute("conn");
		
		try {
			if(conn != null) {
				conn.close();
				System.out.println("db연결 해재");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}
	
	
	
	
}
