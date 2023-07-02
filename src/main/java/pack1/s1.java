package pack1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class s1
 */
public class s1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		int a,b,c,d;
		a= Integer.parseInt(getServletContext().getInitParameter("a"));
		b= Integer.parseInt(getServletContext().getInitParameter("b"));
		c= Integer.parseInt(getServletContext().getInitParameter("c"));
		d= Integer.parseInt(getServletConfig().getInitParameter("d"));

		response.getWriter().append("Sum is: "+(a+b+c+d));
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
