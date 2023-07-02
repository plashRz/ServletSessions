package pack1.FiltersJ;

import jakarta.servlet.Filter;

import java.io.IOException;

/**
 * Servlet Filter implementation class filter1
 */
public class filter1 implements Filter {

	@Override
	public void doFilter(jakarta.servlet.ServletRequest req, jakarta.servlet.ServletResponse resp,
			jakarta.servlet.FilterChain fil) throws IOException, jakarta.servlet.ServletException {
		// TODO Auto-generated method stub
		String n = req.getParameter("user");
		String a = req.getParameter("age");
		resp.setContentType("text/html");
		
		if(n.equals("")||a.equals("")) {
			
			resp.getWriter().append("null values not allowed");
			req.getRequestDispatcher("Login 2.html").include(req, resp);
			
			//or a simple 
			//resp.getWriter().append("null values not allowed");
			// if you want to simply redirect, then first we have type cast resp to http resp
			////HttpServletResponse hsr = (HttpServletResponse) resp; as its a http resp method
			
		}else {
			fil.doFilter(req, resp);
		}
		
	}

       
    /**
     * @see HttpFilter#HttpFilter()
     */

	

}
