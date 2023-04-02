package com.example.fin_quest.services;

import com.example.fin_quest.entities.Answer;
import com.example.fin_quest.entities.Quest;
import com.example.fin_quest.entities.Question;
import com.example.fin_quest.repository.QuestRepository;

//java.util.logging.Logger log = java.util.logging.Logger.getLogger(LoggingJul.class.getName());
import java.util.List;


public class QuestService {

    Quest quest1 = new QuestRepository().getQuest();
    public Question getQuestion(int answerID){

        Question nextQuestion = null;

        List<Question> questions = quest1.getQuesions();
        if(answerID ==0 ){
            nextQuestion = questions.get(0);
        } else if (answerID ==4) {
            nextQuestion = questions.get(3);
        }else {
            for (Question question: questions) {
                List<Answer> answers = question.getAnswers();
                for(Answer answer: answers) {
                    if(answer.getId() == answerID) {
                        nextQuestion = answer.getNextQuestion();
                    }
                }
            }
        }
        return nextQuestion;
    }
}
