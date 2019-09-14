package pl.sda.servlets.print;

import pl.sda.servlets.filter.HttpFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter(urlPatterns = "/print")
public class TextFilter extends HttpFilter {
    @Override
    public void doFilter(HttpServletRequest request,
                         HttpServletResponse response,
                         FilterChain chain)
            throws IOException, ServletException {
        String text = request.getParameter("text");
        request.setAttribute("text", text);
        if (text == null) {
            response.sendError(400, "Text nie może być pusty");
        } else {
            System.out.println("Start doFilter w TextFilter");
            chain.doFilter(request, response);
            System.out.println("Koniec doFilter w TextFilter");
        }
    }
}