package testWeb;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/HelloServlet")
public class Test2Filter implements Filter {

  
    public Test2Filter() {
        System.out.println("Test2Filter");
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		System.out.println("Test2Filter destroy()");
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here

		// pass the request along the filter chain
		System.out.println("Test2Filter before");
		chain.doFilter(request, response);
		System.out.println("Test2Filter after");
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("Test2Filter init()");
	}

}
