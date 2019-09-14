package pl.sda.servlets.todo.servlet;


import pl.sda.servlets.todo.model.Task;
import pl.sda.servlets.todo.repository.TaskRepository;
import sun.nio.cs.ext.ISCII91;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.List;

@WebServlet(urlPatterns = "/todo/new")
public class NewTaskServlet extends HttpServlet {

    private TaskRepository repository =
            TaskRepository.INSTANCE;


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setHeader("Content-Type",
                "text/html; charset=utf-8");
        PrintWriter writer = resp.getWriter();
        writer.append("<html>");

        writer.append("<head>");
        writer.append("<title>Moje zadania</title>");
        writer.append("<meta charset=\"UTF-8\">");
        writer.append("</head>");
        writer.append("<body>");
        writer.append("<h1>Dodaj nowe zadanie</h1>");
        writer.append("<form method='post'>");
        writer.append("<p>Opis zadania</p>");
        writer.append("<input type='text' name='description'>");
        writer.append("<p>Data</p>");
        writer.append("<input type='date'name='date'>");
        writer.append("<br><input type='submit' value='Dodaj zadanie'>");
        writer.append("</form>");
        writer.append("</body>");
        writer.append("</html>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");

        String description = req.getParameter("description");
        String date = req.getParameter("date");

        try{
        Task task=Task.builder()
                .description(description)
                .date(LocalDate.parse(date))
                .done(false)
                .build();


        repository.save(task);
        resp.sendRedirect("/todo/list");
    }catch(DateTimeException e){
        resp.sendError(400, "Data ma niewłaściwy format");
        }
    }
}