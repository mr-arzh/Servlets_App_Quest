package org.javaservapp.servletapp_quest;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/decline")
public class DeclineCall extends HttpServlet {
    String message1;
    String message2;

    @Override
    public void init() throws ServletException {
        message1 = "Ты отклонил вызов аж самих инопланетян!";
        message2 = "Так себе из тебя связист. Мне кажется вы нам не подходите. Мы вам перезвоним.";
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");

        var writer = resp.getWriter();
        writer.println("<h1>"+message1+"</h1>");
        writer.println("<h3>"+message2+"</h3>");
        writer.println("<html><body>");
        writer.println("<a href=\"prologue\">Давай вернемся к началу и попробуем снова :)</a>");
    }

    @Override
    public void destroy() {
        super.destroy();
    }
}
