package org.javaservapp.servletapp_quest;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/lostmem")
public class LostMemory extends HttpServlet {
    private String message1;
    private String message2;

    @Override
    public void init() throws ServletException {
        message1 = "Назначаю тебя нашим связистом!";
        message2 = "С твоим кораблем пытаются связаться НЛО. "
                + "'\n'Твои действия?";
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");

        PrintWriter writer = resp.getWriter();
        writer.println("<h1>" + message1 + "</h1>");
        writer.println("<h3>" + message2 + "</h3>");
        writer.println("<a href=\"accept\">Принять вызов</a>");
        writer.println("<html><body>");
        writer.println("<a href=\"decline\">Отклонить вызов</a>");
    }

    @Override
    public void destroy() {
        super.destroy();
    }
}
