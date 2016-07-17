

import java.io.IOException;
import java.util.Date;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * Servlet Filter implementation class LogFilter
 */
@WebFilter("/LogFilter")
public class LogFilter implements Filter {
	public void  init(FilterConfig config) 
            throws ServletException{
// Get init parameter 
String testParam = config.getInitParameter("test-param"); 

//Print the init parameter 
System.out.println("Test Param: " + testParam); 
}
public void  doFilter(ServletRequest request, 
    ServletResponse response,
    FilterChain chain) 
    throws java.io.IOException, ServletException {

// Get the IP address of client machine.   
String ipAddress = request.getRemoteHost();

// Log the IP address and current timestamp.
System.out.println("IP "+ ipAddress + ", Time "
                          + new Date().toString());

// Pass request back down the filter chain
chain.doFilter(request,response);
}
public void destroy( ){
/* Called before the Filter instance is removed 
from service by the web container*/
}
}
