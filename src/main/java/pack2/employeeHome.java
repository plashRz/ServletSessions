package pack2;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

/**
 * Servlet implementation class employeeHome
 */
public class employeeHome extends HttpServlet {
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
		
		String user = request.getParameter("user");
		String age = request.getParameter("age");
		String city = request.getParameter("city");
		String gender = request.getParameter("gender");
		String email = request.getParameter("email");
		
		response.getWriter().append("<h2>Employee Home</h2><br>");
		response.getWriter().append("Welcome "+user);
		response.getWriter().append("<br>");
		response.getWriter().append("Your details are below: ");
		response.getWriter().append("<br>Age: "+age);
		response.getWriter().append("<br>City: "+city);
		response.getWriter().append("<br>Gender: "+gender);
		response.getWriter().append("<br>Email: "+email);
		
		HttpSession hts = request.getSession();
		hts.setAttribute("user", user);
		hts.setAttribute("age", age);
		hts.setAttribute("city", city);
		hts.setAttribute("gender", gender);
		hts.setAttribute("email", email);
		
		response.getWriter().append("<br><a href='sd'>Store Data</a>");
	}

}
