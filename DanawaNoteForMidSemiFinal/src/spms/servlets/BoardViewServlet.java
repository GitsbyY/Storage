package spms.servlets;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import spms.dao.BoardDao;
import spms.dto.BoardDto;

@WebServlet("/board/view")
public class BoardViewServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		Connection conn = null;

		try {
			int no = Integer.parseInt(req.getParameter("no"));

			ServletContext sc = this.getServletContext();

			conn = (Connection) sc.getAttribute("conn");

			BoardDao boardDao = new BoardDao();
			boardDao.setConnection(conn);
			
			BoardDao boardDaoCnt = new BoardDao();
	        boardDaoCnt.setConnection(conn);
	        boardDaoCnt.postCnt(no);
	        
			BoardDto boardDto = boardDao.viewContent(no);

			req.setAttribute("boardDto", boardDto);

			RequestDispatcher dispatcher = req.getRequestDispatcher("./BoardView.jsp");

			dispatcher.forward(req, res);
		} catch (Exception e) {
			e.printStackTrace();
			
			req.setAttribute("error", e);
			req.setAttribute("msg", "i'm sorry");
			RequestDispatcher dispatcher 
				= req.getRequestDispatcher("/Error.jsp");

			dispatcher.forward(req, res);
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		Connection conn = null;

		try {
			int no = Integer.parseInt(req.getParameter("no"));

			ServletContext sc = this.getServletContext();

			conn = (Connection) sc.getAttribute("conn");

			BoardDao boardDao = new BoardDao();
			boardDao.setConnection(conn);
			
			BoardDto boardDto = boardDao.viewContent(no);

			req.setAttribute("boardDto", boardDto);

			RequestDispatcher dispatcher = req.getRequestDispatcher("./BoardUpdate.jsp");

			dispatcher.forward(req, res);
		} catch (Exception e) {
			e.printStackTrace();
			
			req.setAttribute("error", e);
			req.setAttribute("msg", "i'm sorry");
			RequestDispatcher dispatcher 
				= req.getRequestDispatcher("/Error.jsp");

			dispatcher.forward(req, res);
		}
	}
}
