package pl.sda.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

@WebServlet(urlPatterns = "/world", name="HelloWorldServlet")
public class HelloWorldServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter writer = resp.getWriter();
        writer.append("<html>");
        writer.append("<head><title>Hello World </title></head>");
        writer.append("<body><h1>Hello Word ;)!</h1>");
        writer.append("<p>KOTECZEK ................................</p>");
        writer.append("<p>Hush my dearling ................................</p></body>");
        writer.append("</html>");
    }
}
