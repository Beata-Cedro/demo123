package pl.sda.servletsZadanie4;

import pl.sda.servlets.filter.HttpFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.Optional;

@WebFilter(urlPatterns = "/print")
public class ColorFilter extends HttpFilter {
    @Override
    public void doFilter(HttpServletRequest request,
                         HttpServletResponse response,
                         FilterChain chain)
            throws IOException, ServletException {

        String color =
                Optional.ofNullable(request.getParameter("color"))
                        .orElseGet(
                                () ->
                                        Arrays.stream(request.getCookies())
                                                .filter(c -> "color".equals(c.getName()))
                                                .map(a -> a.getValue())
                                                .findFirst()
                                                .orElse("black")
                        );
        response.addCookie(new Cookie("color", color));
        request.setAttribute("color",color);
        chain.doFilter(request,response);
    }
}
