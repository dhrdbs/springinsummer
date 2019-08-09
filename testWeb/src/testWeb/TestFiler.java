package testWeb;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/*")
public class TestFiler implements Filter {

    
    public TestFiler() {
        System.out.println("TestFilter");
    }

	
	public void destroy() {
		System.out.println("TestFilter destory call");
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here

		// pass the request along the filter chain
		System.out.println("doFilter before");
		chain.doFilter(request, response);
		System.out.println("doFilter after");
	}

	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("TestFilter init call");
		
	}

}
