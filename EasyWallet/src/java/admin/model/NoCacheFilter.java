/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package admin.model;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletResponse;


/**
 *
 * @author gagan
 */
@WebFilter(filterName = "NoCacheFilter", urlPatterns = {"/*"})
public class NoCacheFilter implements Filter{


     public void init(FilterConfig filterConfig) {
         
     }

     public void destroy() {
         
     }

     public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException
    {
          HttpServletResponse hsr = (HttpServletResponse) res;
          hsr.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); // HTTP 1.1.
          hsr.setHeader("Pragma", "no-cache"); // HTTP 1.0.
          hsr.setDateHeader("Expires", 0); // Proxies.
          chain.doFilter(req, res);
    }

}
