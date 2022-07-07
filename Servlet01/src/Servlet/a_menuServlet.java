package Servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.u_login_DAO;

@WebServlet("/a_menuServlet")
public class a_menuServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String pass = request.getParameter("pass");
		String path = "WEB-INF/jsp/login_err.jsp";


        u_login_DAO u = new u_login_DAO();
        String check = u.execute(id);

        if( pass == check ) {
        	path = "WEB-INF/jsp/a_menu.jsp";
        }

		RequestDispatcher dispatcher =
				request.getRequestDispatcher(path);
		dispatcher.forward(request, response);
	}

}
