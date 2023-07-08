package pack1;

import jakarta.servlet.ServletException;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;


public class LoginServlet extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		String name = request.getParameter("user");
		String pass = request.getParameter("pass");
		int b = request.getContentLength();
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		
		HttpSession hts = request.getSession();
		
		
		if(name.equals("user1")&&pass.equals("pass1")) {
			pw.println("Welcome "+name+" "+b);
		}else {
			pw.println("Invalid user"+" "+b);
		}
		pw.println(request.getServerName()+getServletInfo());
		pw.append("\n "+hts.getId());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
