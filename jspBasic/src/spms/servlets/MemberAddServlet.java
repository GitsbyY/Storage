package spms.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MemberAddServlet
 */
@WebServlet("/MemberAddServlet")	//우리가 필요한 정보만 쓰면 된다.
									//2000년대에 쓰이기 시작했다.
public class MemberAddServlet extends HttpServlet {
	
    
	@Override
	protected void doGet(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
		
//		response.getWriter().append('Served at: ').append(request.getContextPath());
		System.out.println("doGet을 탄다");
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		
		String htmlStr ="";
		
		htmlStr += "<!DOCTYPE html>";
		htmlStr += "<html>";
		
		htmlStr += "<head>";
		htmlStr += "<meta charset='UTF-8'>";
		htmlStr += "<title>회원등록</title>";
		htmlStr += "<style type='text/css'>";
		htmlStr += "</style>";
		htmlStr += "</head>";
		
		htmlStr += "<body>";
		htmlStr += "<h1>회원등록</h1>";
		htmlStr += "<form action='add' method='post'>";
		htmlStr += "이름 : <input type='text' name='name'><br>";
		htmlStr += "이메일 : <input type='text' name='email'><br>";
		htmlStr += "암호 : <input type='password' name='password'><br>";
		htmlStr += "<input type='submit' value='추가'>";
		htmlStr += "<input type='reset'value='취소'>";
		htmlStr += "</form>";
		htmlStr += "</body>";
		htmlStr += "</html>";
		
		out.println(htmlStr);
	}

	//데이터베이스에 데이터 추가
	@Override
	protected void doPost(HttpServletRequest req
			, HttpServletResponse res) throws ServletException, IOException {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
//		Statement stmt =null;
//		ResultSet rs = null;
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "ezen";
		String password = "ezen12";
		
		String emailStr = req.getParameter("email");
		String pwdStr = req.getParameter("password");
		String nameStr = req.getParameter("name");
		
		
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			conn = DriverManager.getConnection(url, user, password);
			
			String sql ="";
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, emailStr);
			pstmt.setString(2, pwdStr);
			pstmt.setString(3, nameStr);
			
			pstmt.executeUpdate();
			
			res.setContentType("text/html");
			res.setCharacterEncoding("UTF-8");
			
			PrintWriter out = res.getWriter();
			
			String htmlStr = "";
			
			htmlStr += "<!DOCTYPE html>";
			htmlStr += "<html>";
			htmlStr += "<head>";
			htmlStr += "<title>회원등록</title>";
			htmlStr += "</head>";
			htmlStr += "<body>";
			htmlStr += "<p>등록 성공입니다!</p>";
			htmlStr += "</body>";
			htmlStr += "</html>";
			
			out.println(htmlStr);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {	
			if(pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					// TODO: handle exception
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
			
	}//doPost method 끝

}
