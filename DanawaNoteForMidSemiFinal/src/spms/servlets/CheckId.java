package spms.servlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import spms.dao.MemberDao;
import spms.dto.MemberDto;


@WebServlet("/join/check")
public class CheckId extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	@Override
	public void doGet(HttpServletRequest request, 
			HttpServletResponse response) 
		throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		Connection conn = null;
		
		
		String id = request.getParameter("Id");
		try {
			
			ServletContext sc = this.getServletContext();
			
			conn = (Connection) sc.getAttribute("conn");
			
			MemberDao memberDao = new MemberDao();
			
			memberDao.setConnection(conn);
			System.out.println(memberDao.isDuplicatedId(id));
			// 중복된 아이디 검사
		    if (memberDao.isDuplicatedId(id)) {
		        // 중복된 아이디 처리 로직
		    	
		    	 request.setAttribute("existId", "이미 존재하는 아이디입니다.");
		    	 request.setAttribute("UserJoinId",id);
		    } else {
		    	request.setAttribute("existId", "사용가능한 아이디입니다.");
		    	request.setAttribute("UserJoinId",id);
            }
		    RequestDispatcher dispatcher 
			= request.getRequestDispatcher("../join/JoinForm.jsp");
		    dispatcher.forward(request, response);
		    
		} catch (Exception e) {
			e.printStackTrace();
			
			request.setAttribute("error", e);
			request.setAttribute("msg", "i'm sorry");
			RequestDispatcher dispatcher 
				= request.getRequestDispatcher("/Error.jsp");

			dispatcher.forward(request, response);
		}
		
	} // doGet
	
	
		@Override
		protected void doPost(HttpServletRequest req
			, HttpServletResponse res)
				throws ServletException, IOException {


			
		}
	
}
