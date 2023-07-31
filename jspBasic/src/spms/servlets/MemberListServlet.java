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

import spms.dto.MemberDto;
//이걸 넣으니까 web.xml에서 멤버리스트를 주석처리 했는데도 뜬다.
@WebServlet("/member/list")
							//implements에서 extends로 바뀌었다
							//추상 클래스이다.
public class MemberListServlet extends HttpServlet{
	
	private static final long SerialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest request
			, HttpServletResponse response) throws ServletException, IOException {
		
//		특정 데이터베이스와 연결 정보를 가지는 인터페이스
		Connection conn = null;
		//SQL query문을 DB에 전송하는 방법이 정의 된 인터페이스 
		PreparedStatement pstmt = null;
		//Select 구문 실행 결과를 조회할 수 있는 인터페이스
		//하나만 받아오는 것이 아니기 때문에 Set을 반드시 써야한다
		ResultSet rs = null;
	
		try {
			
			ServletContext sc = this.getServletContext();
			
			conn = (Connection)sc.getAttribute("conn");
		
			String sql = "SELECT MNO, MNAME, EMAIL, CRE_DATE"
					+ " FROM MEMBERS"
					+ " ORDER BY MNO DESC";
			pstmt = conn.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			System.out.println("쿼리 수행 성공");
			response.setContentType("text/html");
	//		출력할 데이터의 문자 집합을 지정한다 ->유니코드 값을 UTF-8로 데이터를 출력할 때 변환한다.
			response.setCharacterEncoding("UTF-8");
	//		클라이언트로 출력 할 수 있도록 출력 스트림 객체를 반환한다
//			PrintWriter out = res.getWriter();
//			
//			out.println("<html><head><title>회원목록</title></head>");
//			out.println("<body><h1>회원목록</h1>");
//			
//			String htmlStr = "";
//			
//			htmlStr += "<p>";
//			htmlStr += "<a href='./add'>";
//			htmlStr += "신규 회원";
//			htmlStr += "</a>";
//			htmlStr += "</p>";
//			
//			out.println(htmlStr);
//			while(rs.next()) {
//				out.println(rs.getInt("MNO") + ". " +
//						"<a href='./update?mNo=" + 
//						rs.getInt("MNO") + 
//						"'>" +
//						rs.getString("MNAME") + "</a>, " +
//						rs.getString("EMAIL") + ", " +
//						rs.getString("CRE_DATE") + 
//						"<a href='./delete?mNo=" + 
//						rs.getInt("MNO") +"'>"+ "[삭제]</a>" +
//						"<br>"
//				);
//			}
//			out.println("</body></html>");
			
			ArrayList<MemberDto> memberList = new ArrayList<>();
			
			//데이터베이스에서 회원정보를 가져오는 로직
			int mno = 0;
			String mname ="";
			String email = "";
			Date creDate = null;
			
			while(rs.next()) {
				MemberDto memberDto = new MemberDto();
				
				mno = rs.getInt("MNO");
				mname = rs.getString("MNAME");
				email = rs.getString("EMAIL");
				creDate = rs.getDate("CRE_DATE");
				
				memberDto.setNo(mno);
				memberDto.setName(mname);
				memberDto.setEmail(email);
				memberDto.setCreateDate(creDate);
				
				memberList.add(memberDto);
			}
			
			request.setAttribute("memberList", memberList);
			//RequestDispatcher를 통해서 뷰로 보낸다
			RequestDispatcher dispatcher = 
					request.getRequestDispatcher("/member/MemberListView.jsp");
//			인클루딩
			dispatcher.include(request, response);
		} catch (Exception e) {
			
			e.printStackTrace();
			
//			throw new ServletException(e);
			
			request.setAttribute("error", e);
			request.setAttribute("msg", "Exception PopUp");
			RequestDispatcher dispatcher = 
					request.getRequestDispatcher("/Error.jsp");
//			jsp의 인클루드랑 똑같다 -> 포워딩
			dispatcher.forward(request, response);
			
			
		}finally {	
				//		6단계
				//		자원 연결 해제(자원회수)
			if(rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			}
			if(pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}//finally 끝
	}
	
	
//	@Override
//	public void service(ServletRequest req, ServletResponse res) 
//			throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		
//		//특정 데이터베이스와 연결 정보를 가지는 인터페이스
//		Connection conn = null;
//		//SQL query문을 DB에 전송하는 방법이 정의 된 인터페이스 
//		Statement stmt =null;
//		//Select 구문 실행 결과를 조회할 수 있는 인터페이스
//		//하나만 받아오는 것이 아니기 때문에 Set을 반드시 써야한다
//		ResultSet rs = null;
//		
//		
////		사용 할 JDBC 드라이버 / 드라이버타입 # 서버주소와 포트번호 & DB서비스 아이디 
////			"jdbc:oracle/ thin# @localhost:1521& xe"
//		
//		//문자열을 통해서 어떤 데이터 베이스에 접속 할 지 결정한다.
//		String url = "jdbc:oracle:thin:@localhost:1521:xe";
//		String user = "ezen";
//		String password = "ezen12";
//		
//		try {
//			//new를 한 것과 같아서 객체로 사용이 가능하다
//			//JDBC 드라이버 로드(객체생성과 같은 것)
//			//lib 폴더에 드라이버를 넣었더니 1차 오류가 해결되었다. 
////			1단계
//			Class.forName("oracle.jdbc.driver.OracleDriver");
//			
//			//데이터베이스 연결 -> sql과 연결이 되었다.
////			2단계
//			conn = DriverManager.getConnection(url, user, password);
////			상태? CRUD 할 수 있는 sql객체
////			Statement 객체를 생성했다.
////			3단계
//			stmt = conn.createStatement();
//			
////			sql에서 작성을 하는 것이 아니라 여기에서 불러오는 것이다.
//			String sql = "SELECT MNO, MNAME, EMAIL, CRE_DATE"
//					+ " FROM MEMBERS" //sql에서 엔터는 띄어쓰기로 표현
//					+ " ORDER BY MNO DESC";
//			
////			4단계 sql문 수행(전송) -> stmt.executeQuery(sql)
////			5단계 sql문 결과 받기 -> rs =
//			rs = stmt.executeQuery(sql);
//			
////			출력할 데이터의 인코딩 형식과 문자 집합을 지정한다
//			res.setContentType("text/html");
////			출력할 데이터의 문자 집합을 지정한다 ->유니코드 값을 UTF-8로 데이터를 출력할 때 변환한다.
//			res.setCharacterEncoding("UTF-8");
////			클라이언트로 출력 할 수 있도록 출력 스트림 객체를 반환한다
//			PrintWriter out = res.getWriter();
//			
//			out.println("<html><head><title>회원목록</title></head>");
//			out.println("<body><h1>회원목록</h1>");
//			
//			String htmlStr = "";
//			
//			htmlStr += "<p>";
//			htmlStr += "<a href='./add'>";
//			htmlStr += "신규 회원";
//			htmlStr += "</a>";
//			htmlStr += "</p>";
//			
//			out.println(htmlStr);
//			
//			//rs에 객체가 있다면 바로 불러온다. 
//			//rs에 Select 문을 써 준 그대로 나온다. 
//			//다만, 유형이 있기에 int와 string, date로 받는 것이다.
//			//내가 원하는대로 html화면을 구성한다. 
//			while(rs.next()) {
//				out.println(rs.getInt("MNO") + ". " +
//						"<a href='./update?mNo=" + 
//						rs.getInt("MNO") + 
//						"'>" +
//						rs.getString("MNAME") + "</a>, " +
//						rs.getString("EMAIL") + ", " +
//						rs.getString("CRE_DATE") + 
//						"<a href='./delete?mNo=" + 
//						rs.getInt("MNO") +"'>"+ "[삭제]</a>" +
//						"<br>"
//				);
//			}
//			out.println("</body></html>");
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}finally {	
////			6단계
////			자원 연결 해제(자원회수)
//			if(rs != null) {
//				try {
//					rs.close();
//				} catch (SQLException e) {
//					// TODO: handle exception
//					e.printStackTrace();
//				}
//			}
//			if(stmt != null) {
//				try {
//					stmt.close();
//				} catch (SQLException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}
//			
//			if(conn != null) {
//				try {
//					conn.close();
//				} catch (SQLException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}
//			
//		}//finally 끝
//	
//	}// service 메서드 끝
	
	@Override
	protected void doPost(HttpServletRequest req
			, HttpServletResponse res) throws ServletException, IOException {
		
	}
	
}//class 마지막
