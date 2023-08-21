package spms.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/member/add")	//우리가 필요한 정보만 쓰면 된다.
									//2000년대에 쓰이기 시작했다.
public class MemberAddServlet extends HttpServlet {
	
    
	@Override
	protected void doGet(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
		
//		response.getWriter().append('Served at: ').append(request.getContextPath());
		System.out.println("doGet을 탄다");
		
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		RequestDispatcher dispatcher = 
				request.getRequestDispatcher("../MemberForm.jsp");
//		인클루딩
		dispatcher.forward(request, response);
	}

	//데이터베이스에 데이터 추가, 회원정보 저장
	@Override
	protected void doPost(HttpServletRequest req
			, HttpServletResponse res) throws ServletException, IOException {
		
		Connection conn = null;
		PreparedStatement pstmt = null;

		String emailStr = req.getParameter("email");
		String pwdStr = req.getParameter("password");
		String nameStr = req.getParameter("name");
		
		
		try {
			
			ServletContext sc = this.getServletContext();
			
			conn = (Connection)sc.getAttribute("conn");

			String sql ="";
			sql +=	"INSERT INTO MEMBERS";
			sql +=	"(MNO, EMAIL, PWD, MNAME, CRE_DATE, MOD_DATE)";
			sql +=	"VALUES(MEMBERS_MNO_SEQ.NEXTVAL, ?, ?, ?, SYSDATE, SYSDATE )";

			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, emailStr);
			pstmt.setString(2, pwdStr);
			pstmt.setString(3, nameStr);
			
			pstmt.executeUpdate();
			
			//다른 페이지로 이동을 시켜준다
			res.sendRedirect("./list");

		}catch (SQLException e) {
			
			e.printStackTrace();
			
//			res.setCharacterEncoding("UTF-8");
//			req.setAttribute("error", e);
			req.setAttribute("msg", "회원 추가하다 오류남");
			RequestDispatcher dispatcher = 
					req.getRequestDispatcher("/Error.jsp");
//			jsp의 인클루드랑 똑같다 -> 포워딩
			dispatcher.forward(req, res);
		} finally {	
			if(pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			}
			
			
		}//finally 끝
			
	}//doPost method 끝

}
