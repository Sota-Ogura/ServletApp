package Servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DAO.SignupDAO;
import scopedata.Account;


@WebServlet("/u_entry_2")
public class u_entry_2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");

		HttpSession session = request.getSession();
		Account account = new Account( id , pw );
		session.setAttribute( "LoginUser" , account );


		SignupDAO dao = new SignupDAO();
		dao.execte(id,pw);

		RequestDispatcher dispatcher =
				request.getRequestDispatcher("WEB-INF/jsp/u_entry_2.jsp");
		dispatcher.forward(request, response);
	}

}
