package com.example.fin_quest.services;

import com.example.fin_quest.entities.Answer;
import com.example.fin_quest.entities.Quest;
import com.example.fin_quest.entities.Question;


import java.util.List;


public class QuestService {

    Quest quest1 = new CreationService().createQuest();
    public Question getQuestion(int answerID){

        Question nextQuestion = null;

        List<Question> questions = quest1.getQuesions();
        for (Question question: questions) {
            List<Answer> answers = question.getAnswers();
            for(Answer answer: answers) {
                if(answer.getId() == answerID) {
                    nextQuestion = answer.getNextQuestion();
                }
            }
        }

        return nextQuestion;
    }
}
