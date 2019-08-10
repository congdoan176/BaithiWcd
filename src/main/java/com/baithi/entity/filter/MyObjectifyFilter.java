package com.baithi.entity.filter;

import com.baithi.entity.Phone;
import com.googlecode.objectify.ObjectifyService;

import javax.servlet.*;
import java.io.IOException;


public class MyObjectifyFilter implements Filter {

    public void init(FilterConfig filterConfig) throws ServletException {

    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        ObjectifyService.register(Phone.class);
        filterChain.doFilter(servletRequest, servletResponse);
    }
    public void destroy() {

    }
}
