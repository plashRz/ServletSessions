package pack1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class LoginServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		String name = request.getParameter("user");
		String pass = request.getParameter("pass");
		int b = request.getContentLength();
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		
		if(name.equals("user1")&&pass.equals("pass1")) {
			pw.println("Welcome "+name+" "+b);
		}else {
			pw.println("Invalid user"+" "+b);
		}
		pw.println(request.getServerName()+getServletInfo());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
