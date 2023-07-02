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
		
		if(n.equals("")||a.equals("")) {
			resp.getWriter().append("null values not allowed");
		}else {
			fil.doFilter(req, resp);
		}
		
	}

       
    /**
     * @see HttpFilter#HttpFilter()
     */

	

}
