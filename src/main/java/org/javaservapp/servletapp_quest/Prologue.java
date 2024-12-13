package org.javaservapp.servletapp_quest;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/prologue")
public class Prologue extends HttpServlet {

    private String messagePrologue;

    private String messagePrologueStory;
    private String messageGreeting;
    private String messageGreetingStory;
    private String messageThanks;

    @Override
    public void init(){
        messagePrologue = "Пролог";
        messagePrologueStory = "Ты стоишь в космическом порту и готов подняться на борт своего корабля. Разве ты не об этом мечтал? Стать капитаном галактического судна с экипажем, который будет совершать подвими под твоих командованием. " +
                "Так что вперед!";
        messageGreeting = "Знакомство с эксипажем";
        messageGreetingStory = "Когда ты поднялся на борт корабля, тебя поприветствовала девушка с черной палкой в руках. "
                + "- Здравствуйте, командир! Я Зинаида - ваша помошница. Видите?"
                + " Там в углу пьет кофе наш штурман -Сержант Перегарный Шлейф, под штурвалом спит наш борт механика - Черный Богдан, а фотографирует его Сергей Стальная Пятка - наш навигатор. "
                + " Как обращаться к вам?";
        messageThanks = "Рад познакомиться, О Великий Господин/Госпожа ";
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");

        var writer = resp.getWriter();
        writer.println("<html><body>");
        writer.println("<h1>" + messagePrologue + "<h1>");
        writer.println("<h3>" + messagePrologueStory + "</h3>");
        writer.println("<html><body>");
        writer.println("<h1>" + messageGreeting + "</h1>");
        writer.println("<h3>" + messageGreetingStory + "</h3>");
        writer.println("<html><body>");
        writer.println("<form action=\"prologue\" method=\"post\">\n" +
                "      Введите имя : <input type = \"text\" name = \"login\">\n" +
                "      <br/>\n" +
                "      <input type=\"submit\" value = \"Представиться\">\n" +
                "    </form>");
        writer.println("<a href=\"lostmem\">Поеахли! Я сказала па-е-ха-ли!</a>");

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");

        var writer = resp.getWriter();
        writer.println("<h1>" + messageThanks + req.getParameter("login") + " :)  " + "</h1>");
        writer.println("<a href=\"lostmem\">А теперь давай стартовать!</a>");

    }

    @Override
    public void destroy() {
        super.destroy();
    }
}
