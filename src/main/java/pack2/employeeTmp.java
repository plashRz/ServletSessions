package pack2;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class employeeTmp
 */
public class employeeTmp extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		response.getWriter().append("Served at: ").append(request.getContextPath());	
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html");
		
		String name = request.getParameter("user");
		String pass = request.getParameter("pass");

		response.getWriter().append("Welcome "+name);
		response.getWriter().append("<br>");
		response.getWriter().append("<form action='ef' method='post'>");
		response.getWriter().append("<input type='hidden' name='uid' value="+name+">");
		response.getWriter().append("<input type='hidden' name='pss' value="+pass+">");
		response.getWriter().append("<input type='submit' value='submit'>");
		response.getWriter().append("</form>");
		
		

	}

}
