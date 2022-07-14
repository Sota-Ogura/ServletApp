package Servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/u_menuServlet")
public class u_menuServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher =
			request.getRequestDispatcher("WEB-INF/jsp/u_entry_1.jsp"); //新規登録jsp に飛ぶ
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String id = request.getParameter("id");
		String pass = request.getParameter("pass");
//		String path = "WEB-INF/jsp/login_err.jsp";

//        u_login_DAO u = new u_login_DAO();
//        String check = u.execute(id);
//
//        if( pass == check ) {
        	String path = "WEB-INF/jsp/u_menu.jsp";
//        }
//
//        
		RequestDispatcher dispatcher =
				request.getRequestDispatcher(path);
		dispatcher.forward(request, response);

	}

}
