package org.javaservapp.servletapp_quest;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/reportufo")
public class ReportUFO extends HttpServlet {

    private String message1;
    private String message2;

    @Override
    public void init() throws ServletException {
        message1 = "Ты сделал доклад по форме к командиру";
        message2 = "Командир тебя внимательно выслушал. Проверил полученные тобой данные. "
        + "К сожалению, это был новый для тебя тип астероида излучающий низкочастотные звуковые сигналы. Такого в своей практике ты не встречал. "
        + "Но командир серьезно отнесся к твоей находке и дал тебе внеочередной отпуск за бдительность. Ты выйграл!";

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");

        var writer = resp.getWriter();
        writer.println("<html><body>");
        writer.println("<h1>"+message1+"</h1>");
        writer.println("<h3>"+message2+"</h3>");
        writer.println("<html><body>");
        writer.println("<a href=\"prologue\">Может попробуем снова? :)</a>");
    }
}
