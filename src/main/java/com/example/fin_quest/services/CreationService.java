package com.example.fin_quest.services;
import com.example.fin_quest.entities.Answer;
import com.example.fin_quest.entities.Quest;
import com.example.fin_quest.entities.Question;
import java.util.ArrayList;
import java.util.List;

public class CreationService {
    public Quest createQuest(){
        Quest quest = new Quest();
        Question question1 = new Question(1, "Ты потерял память. Принять вызов НЛО?",
                List.of(new Answer(1, "Принять вызов"), new Answer(2,"Отклонить вызов")));
        Question question2 = new Question(2, "Ты принял вызов. Поднимаешься на мостик к капитану?",
                List.of(new Answer(3, "Подняться на мостик"), new Answer(4,"Отказаться подниматься на мостик")));
        Question question3 = new Question(3, "Ты поднялся на мостик. Ты кто?",
                List.of(new Answer(5, "Рассказать правду о себе"), new Answer(6,"Солгать о себе")));

        List<Question> questions = new ArrayList<>();
        questions.add(question1);
        questions.add(question2);
        questions.add(question3);

        quest.setQuesions(questions);

        return quest;

    }
}
