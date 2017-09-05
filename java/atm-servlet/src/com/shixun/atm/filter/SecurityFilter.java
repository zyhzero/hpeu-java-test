package com.shixun.atm.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

/**
 * Servlet Filter implementation class SecurityFilter
 */
@WebFilter("/*")
public class SecurityFilter implements Filter {
	public SecurityFilter() {
	}

	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		HttpServletRequest httpServletRequest = (HttpServletRequest) request;

		Object index = httpServletRequest.getSession().getAttribute("accountIndex");
		String requestURI = httpServletRequest.getRequestURI();
		System.out.println(requestURI);

		if (requestURI.contains("LoginServlet") || requestURI.contains("images") || requestURI.contains("css")||index != null) {
			chain.doFilter(request, response);
		} else {
			request.getRequestDispatcher("/login.jsp").forward(request, response);
		}

	}

	public void init(FilterConfig fConfig) throws ServletException {
	}

}
