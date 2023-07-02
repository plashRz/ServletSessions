package pack1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class initParamServlet
 */
public class initParamServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String s1 = getServletConfig().getInitParameter("a1");
		String s2 = getServletConfig().getInitParameter("a2");
		String s3 = getServletConfig().getServletName();
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		pw.println("s1: "+s1+"<br> s2: "+s2+"<br> s3: "+s3);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
