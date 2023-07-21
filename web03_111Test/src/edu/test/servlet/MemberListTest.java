package edu.test.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MemberListTest extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) 
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		
			Connection conn = null;
			Statement stmt =null;
			ResultSet rs = null;
			
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "ezen";
			String password = "ezen12";
			
			try {

				Class.forName("oracle.jdbc.driver.OracleDriver");
				conn = DriverManager.getConnection(url, user, password);

				stmt = conn.createStatement();
				
				String sql = "SELECT MNO, MNAME, EMAIL, CRE_DATE, MOD_DATE"
						+ " FROM MEMBERS" + " ORDER BY MNO DESC";

				rs = stmt.executeQuery(sql);
				

				res.setContentType("text/html");
				res.setCharacterEncoding("UTF-8");
				PrintWriter out = res.getWriter();
				
				out.println("<html><head><title>회원목록</title></head>");
				out.println("<body><h1>회원목록</h1>");

				while(rs.next()) {
					out.println(rs.getString("mno") + ") " +
							rs.getString("mname") + ", " +
							rs.getString("email") + ", " +
							rs.getDate("cre_date")+ ", " +
							rs.getDate("mod_date")+ "<br>"
					);
				}
				out.println("</body></html>");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {	
//				6단계
//				자원 연결 해제(자원회수)
				if(rs != null) {
					try {
						rs.close();
					} catch (SQLException e) {
						// TODO: handle exception
						e.printStackTrace();
					}
				}
				if(stmt != null) {
					try {
						stmt.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
				if(conn != null) {
					try {
						conn.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
			}//finally 끝
		
		}// service 메서드 끝

}
