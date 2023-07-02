package pack1.FiltersJ;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import java.io.IOException;

/**
 * Servlet Filter implementation class LoggerFilter
 */
public class LoggerFilter implements Filter {
       
	@Override
	public void doFilter(jakarta.servlet.ServletRequest arg0, jakarta.servlet.ServletResponse arg1,
			jakarta.servlet.FilterChain arg2) throws IOException, jakarta.servlet.ServletException {
		// TODO Auto-generated method stub
		arg1.getWriter().append("logger filter here \n");
		arg2.doFilter(arg0, arg1);
		
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		Filter.super.init(filterConfig);
	}

	
	
}
