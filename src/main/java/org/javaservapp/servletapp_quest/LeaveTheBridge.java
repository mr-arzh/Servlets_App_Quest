package org.javaservapp.servletapp_quest;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/leavethebridge")
public class LeaveTheBridge extends HttpServlet {

    private String message1;
    private String message2;

    @Override
    public void init() throws ServletException {
        message1 = "То есть сериальчики тебе важнее доклада о контакте с НЛО?";
        message2 = "На этом твоя миссия закончена, друг. Возвращайся когда поработаешь над своей дисциплной.";
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");

        var writer = resp.getWriter();
        writer.println("<h1>" + message1 + "</h1>");
        writer.println("<h3>" + message2 + "</h3>");
        writer.println("<html><body>");

        writer.println("<a href=\"prologue\">Давай вернемся к началу и попробуем снова :)</a>");
    }


}
