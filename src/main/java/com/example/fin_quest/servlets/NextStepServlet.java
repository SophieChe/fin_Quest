package com.example.fin_quest.servlets;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "NextStepServlet", value = "/nextStep")
public class NextStepServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String answer = request.getParameter("answer");

        /*создать класс с картой, куда помместить ключ - номер, значение - новое сообщение и метод с параметром,
        который по параметру будет искать нужное следующее сообщение квеста
        сделать здесь объект того класса и вызвать метод, куда передать номер,выбранного шага.
         Получить номер шага -  взять из response  ответ и  через карту найти его номер*/

        PrintWriter writer = response.getWriter();
        writer.write("<html><body>" + "Какой-то ответ" + "</body></html>");
        writer.flush();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
