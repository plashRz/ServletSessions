package pack2;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

/**
 * Servlet implementation class storeData
 */
public class storeData extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html");
		
		HttpSession hts = request.getSession();
	
		response.getWriter().append("<h2>Store data</h2><br>");
		response.getWriter().append("Welcome "+hts.getAttribute("user"));
		response.getWriter().append("<br>");
		response.getWriter().append("Your details are below: ");
		response.getWriter().append("<br>Age: "+hts.getAttribute("age"));
		response.getWriter().append("<br>City: "+hts.getAttribute("city"));
		response.getWriter().append("<br>Gender: "+hts.getAttribute("gender"));
		response.getWriter().append("<br>Email: "+hts.getAttribute("email"));
		response.getWriter().append("<br> get id: "+hts.getId());
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
