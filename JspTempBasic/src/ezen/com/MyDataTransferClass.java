package ezen.com;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/test2")
public class MyDataTransferClass extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req
			, HttpServletResponse res) throws ServletException, IOException {
		
		MemberDto member1 = new MemberDto(1, "Lim", "API");
		MemberDto member2 = new MemberDto(2, "Park", "Back");
		MemberDto member3 = new MemberDto(3, "Son", "DB");
		
		ArrayList<MemberDto> memberList = new ArrayList<MemberDto>();
		
		memberList.add(member1);
		memberList.add(member2);
		memberList.add(member3);
		
		req.setAttribute("memberList", memberList);
		req.setAttribute("member1", member1);
		req.setAttribute("member2", member2);
		req.setAttribute("member3", member3);
		
		RequestDispatcher dispatcher =
				req.getRequestDispatcher("/JspCustomTagTest3.jsp");
		res.setCharacterEncoding("UTF-8");
		dispatcher.include(req, res);
	}
	
	
}
