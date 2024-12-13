package org.javaservapp.servletapp_quest;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/accept")
public class AcceptCall extends HttpServlet {

    private String message1;
    private String message2;

    @Override
    public void init() throws ServletException {
        message1 = "Ты принял вызов НЛО.";
        message2 = "Поднимешься на мостик к кэпу?";
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");

        PrintWriter writer = resp.getWriter();
        writer.println("<h1>" + message1 + "<h1>");
        writer.println("<h3>" + message2 + "</h3>");
        writer.println("<html><body>");
        writer.println("<a href=\"uptobridge\">Подняться на мостик</a>");
        writer.println("<html><body>");
        writer.println("<a href=\"leavethebridge\">Забить. Пойти досматривать сериал</a>");
    }

    @Override
    public void destroy() {
        super.destroy();
    }
}
