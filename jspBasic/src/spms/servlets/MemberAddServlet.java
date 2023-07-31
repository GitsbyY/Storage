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
		PrintWriter out = response.getWriter();
		
		String htmlStr ="";
		
		htmlStr += "<!DOCTYPE html>";
		htmlStr += "<html>";
		
		htmlStr += "<head>";
		htmlStr += "<meta charset='UTF-8'>";
		htmlStr += "<title>회원등록</title>";
		htmlStr += "</head>";
		
		htmlStr += "<body>";
		
		htmlStr += "<h1>회원등록</h1>";
					//a Tag, location Tag, form Tag 는 화면 전환이 된다.
					//그 중에서 form은 데이터를 가지고 이동하는 태그이다.
											//doPost를 호출한다.
		htmlStr += "<form action='add' method='post'>";
		htmlStr += "이름 : <input type='text' name='name'><br>";
		htmlStr += "이메일 : <input type='text' name='email'><br>";
		htmlStr += "암호 : <input type='password' name='password'><br>";
								//submit을 사용하면 사용자의 인풋이 같이 넘어간다.
		htmlStr += "<input type='submit' value='추가'>";
		htmlStr += "<input type='reset' value='취소'>";
		htmlStr += "</form>";
		
		htmlStr += "</body>";
		
		htmlStr += "</html>";
		
		out.println(htmlStr);
	}

	//데이터베이스에 데이터 추가, 회원정보 저장
	@Override
	protected void doPost(HttpServletRequest req
			, HttpServletResponse res) throws ServletException, IOException {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
//		Statement stmt =null;
//		ResultSet rs = null;
	
//		ServletContext sc = this.getServletContext();
		
//		String driver = sc.getInitParameter("driver");
//		String url = sc.getInitParameter("url");
//		String user = sc.getInitParameter("user");
//		String password = sc.getInitParameter("password");
		//이 식을 넣음으로 인해서 한글이 깨지지 않고 출력된다.
		//서블릿에서 getParameter를 호출하면 기본적으로 ISO-8859....으로 인코딩 된다.
		//그런데 클라이언트가 보낸 문자를 영어라고 간주하고 유니코드로 변경하기 때문에 한글이 깨진다.
		//영어는 1byte, 한글은 3byte이다.
//		req.setCharacterEncoding("UTF-8");
		
		// 사용자 입력 매개변수의 값 가져오기
		String emailStr = req.getParameter("email");
		String pwdStr = req.getParameter("password");
		String nameStr = req.getParameter("name");
		
		
		try {
			
			ServletContext sc = this.getServletContext();
			
			conn = (Connection)sc.getAttribute("conn");
			
//			String sql ="INSERT INTO MEMBERS"
//					+ " VALUE(EMAIL, PWD, MNAME)"
//					+ " VALUES('S7@test.com', '1111', '이순신');";
			
			String sql ="";
			sql +=	"INSERT INTO MEMBERS";
			sql +=	"(MNO, EMAIL, PWD, MNAME, CRE_DATE, MOD_DATE)";
			sql +=	"VALUES(MEMBERS_MNO_SEQ.NEXTVAL, ?, ?, ?, SYSDATE, SYSDATE )";
			//?를 사용하면 자바의 변수를 사용 할 수 있다	
			
//			INSERT INTO MEMBERS
//			VALUE(EMAIL, PWD, MNAMe)
//			VALUES('S7@test.com', '1111', '이순신');
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, emailStr);
			pstmt.setString(2, pwdStr);
			pstmt.setString(3, nameStr);
			
			pstmt.executeUpdate();
			
			//다른 페이지로 이동을 시켜준다
			res.sendRedirect("./list");
			
//			res.setContentType("text/html");
//			res.setCharacterEncoding("UTF-8");
//			
//			PrintWriter out = res.getWriter();
//			
//			String htmlStr = "";
//			
//			htmlStr += "<!DOCTYPE html>";
//			htmlStr += "<html>";
//			htmlStr += "<head>";					//1초뒤에 페이지 리스트로 바뀜
////			htmlStr += "<meta http-equiv='Refresh' content='1; url=list'>";
//			htmlStr += "	<title>회원등록결과</title>";
//			htmlStr += "</head>";
//			htmlStr += "<body>";
//			htmlStr += "	<p>등록 성공입니다!</p>";
//			htmlStr += "</body>";
//			htmlStr += "</html>";
//			
//			out.println(htmlStr);
//			
////			res는 윈도우 그 자체 //5초 뒤에 페이지리스트로 바뀐다
//			res.addHeader("Refresh", "5; url=./list");
			
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();} 
			
		}catch (SQLException e) {
			
			e.printStackTrace();
			
//			res.setCharacterEncoding("UTF-8");
//			req.setAttribute("error", e);
//			req.setAttribute("msg", "회원 추가하다 오류남");
//			RequestDispatcher dispatcher = 
//					req.getRequestDispatcher("/Error.jsp");
//			jsp의 인클루드랑 똑같다 -> 포워딩
//			dispatcher.forward(req, res);
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
