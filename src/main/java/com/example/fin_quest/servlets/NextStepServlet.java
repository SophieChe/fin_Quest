package com.example.fin_quest.servlets;

import com.example.fin_quest.entities.Question;
import com.example.fin_quest.services.QuestService;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "NextStepServlet", value = "/nextStep")
public class NextStepServlet extends HttpServlet {
    QuestService questService =  new QuestService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       String answer = request.getParameter("answer");
        Question question = questService.getQuestion(Integer.parseInt(answer));
         String question1 = question.getQuestion();
         request.setAttribute("question", question1);
         RequestDispatcher requestDispatcher = request.getRequestDispatcher("/question.jsp");
         requestDispatcher.forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
