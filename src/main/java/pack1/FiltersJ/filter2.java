package pack1.FiltersJ;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import java.io.IOException;
/**
 * Servlet Filter implementation class filter2
 */
public class filter2 implements Filter {

	@Override
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain fil)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		
		String n = req.getParameter("user");
		String a = req.getParameter("age");
		
		if(n.equals("admin")&&a.equals("30")) {
			fil.doFilter(req, resp);
		}else {
			resp.getWriter().append("access not allowed");
		}
		
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		Filter.super.init(filterConfig);
	}
       
    /**
     * @see HttpFilter#HttpFilter()
     */

}
