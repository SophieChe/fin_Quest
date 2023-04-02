package com.example.fin_quest.services;

import com.example.fin_quest.entities.Answer;
import com.example.fin_quest.entities.Question;
import org.junit.Test;

import java.util.List;

import static java.lang.System.out;
import static org.junit.Assert.assertEquals;

public class QuestServiceTest {
    @Test
    public void getQuestion(){
        QuestService questService = new QuestService();
        Answer answer1 = new Answer(1, "Принять вызов");
        Answer answer2 = new Answer(2,"Отклонить вызов");
        Question questionExp = new Question(1, "Ты потерял память. Принять вызов НЛО?",
                List.of(answer1, answer2));
        Question result = questService.getQuestion(0);

        assertEquals(questionExp, result);
    }
}
