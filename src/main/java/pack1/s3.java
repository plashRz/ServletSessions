package pack1;

import jakarta.servlet.ServletException;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class s3
 */
public class s3 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int a,b,d;
		a= Integer.parseInt(getServletContext().getInitParameter("a"));
		b= Integer.parseInt(getServletContext().getInitParameter("b"));
		d= Integer.parseInt(getServletConfig().getInitParameter("d"));

		response.getWriter().append("Value of a is: "+a+"\n");
		response.getWriter().append("Value of b is: "+b+"\n");
		response.getWriter().append("Value of d is: "+d+"\n");
		
		response.getWriter().append("Sum is: "+(a+b+d));
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
