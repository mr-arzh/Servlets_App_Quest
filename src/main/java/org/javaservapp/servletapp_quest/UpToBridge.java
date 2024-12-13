package org.javaservapp.servletapp_quest;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/uptobridge")
public class UpToBridge extends HttpServlet {

    private String message1;
    private String message2;

    @Override
    public void init() throws ServletException {
        message1 = "Ты поднялся на мостик";
        message2 = "Командир сегодня явно не в духе. Стырый космический Волк. Ух, лучше не попадать ему сегодня под руку. Требует представиться по форме.";
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");

        PrintWriter writer = resp.getWriter();
        writer.println("<h1>" + message1 + "</h1>");
        writer.println("<h3>" + message2 + "</h3>");
        writer.println("<html><body>");
        writer.println("<a href=\"reportufo\">Представиться по форме</a>");
        writer.println("<a href=\"unprep\">Да какая форма? тут НЛО, скорее рассказать! Я ж прославлюсь</a>");
    }

    @Override
    public void destroy() {
        super.destroy();
    }
}
