package top.devhub.website.filter;

import org.springframework.web.filter.GenericFilterBean;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Adam.Zhang on 2017/7/10.
 */
public class RequestFilter extends GenericFilterBean {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("111111111111111111111");
        HttpServletRequest httpServletRequest = (HttpServletRequest) request;
        String domainName = request.getServerName();
        if (domainName.equals("devhub.top")) {
            String url = "www." + domainName + httpServletRequest.getRequestURI();
            ((HttpServletResponse) response).sendRedirect("http://" + url);
        }
        chain.doFilter(request, response);
    }
}
