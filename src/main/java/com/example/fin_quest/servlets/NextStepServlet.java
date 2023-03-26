package com.example.fin_quest.servlets;

import com.example.fin_quest.entities.Answer;
import com.example.fin_quest.entities.Question;
import com.example.fin_quest.services.QuestService;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "NextStepServlet", value = "/nextStep")
public class NextStepServlet extends HttpServlet {
    QuestService questService =  new QuestService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String answer = request.getParameter("answer");
        Question question = questService.getQuestion(Integer.parseInt(answer));
        String questionText = question.getText();
        request.setAttribute("questionText", questionText);

        Answer answer1 = question.getAnswers().get(0);
        Answer answer2 = question.getAnswers().get(1);

        String answer1Text = answer1.getText();
        String answer2Text = answer2.getText();

        int answer1ID = answer1.getId();
        int answer2ID = answer2.getId();

        request.setAttribute("answer1Text", answer1Text);
        request.setAttribute("answer2Text", answer2Text);

        request.setAttribute("answer1Id", answer1ID);
        request.setAttribute("answer2Id", answer2ID);


        RequestDispatcher requestDispatcher = request.getRequestDispatcher("WEB-INF/question.jsp");
         requestDispatcher.forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
