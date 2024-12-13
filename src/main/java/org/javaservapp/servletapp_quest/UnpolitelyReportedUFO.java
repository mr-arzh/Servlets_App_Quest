package org.javaservapp.servletapp_quest;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/unprep")
public class UnpolitelyReportedUFO extends HttpServlet {

    private String message1;
    private String message2;

    @Override
    public void init() throws ServletException {
        message1 = "Наплевав на субординацию ты выкррикнул -Эй шеф! Там какая-то херня излучает неведомый сигнал!";
        message2 = "За это ты получил 5 нарядов-дежурств суточных вне очереди и выговор за неуважение к командиру. Боюсь, что это провал.";
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");

        PrintWriter writer = resp.getWriter();
        writer.println("<h1>" + message1 + "</h1>");
        writer.println("<h2>" + message2 + "</h2>");
        writer.println("<html><body>");
        writer.println("<a href=\"prologue\">Давай вернемся к началу и попробуем снова :)</a>");
    }
}
