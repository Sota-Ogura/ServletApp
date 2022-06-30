package Servlet;

import java.io.IOException;
import java.util.Scanner;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DAO.u_login_DAO;
import scopedata.Account;

@WebServlet("/u_login")
public class u_login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher =
				request.getRequestDispatcher("#");
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String id = request.getParameter("id");
		String pass = request.getParameter("pass");
	    String hashvalue;
	    String path = "login_err.jsp";

		HttpSession session = request.getSession();
		Account account = new Account (id , pass);
		session.setAttribute("User", account);

	    //ハッシュの作成
	    Scanner  stdin = new Scanner( System.in );
	    pass = stdin.nextLine();
	    MakeHash mh = new MakeHash( pass );
        hashvalue = mh.getHash();

        //passを参照
        u_login_DAO u = new u_login_DAO();
        String check = u.execute(id);

        //ハッシュ比較
        if(hashvalue == check) {
        	path = "u_menu.jsp";
        }

		RequestDispatcher dispatcher =
				request.getRequestDispatcher(path);
		dispatcher.forward(request, response);

	}

}
