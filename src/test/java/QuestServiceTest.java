import com.example.fin_quest.entities.Answer;
import com.example.fin_quest.entities.Quest;
import com.example.fin_quest.entities.Question;
import com.example.fin_quest.repository.QuestRepository;
import com.example.fin_quest.services.QuestService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class QuestServiceTest {
    Quest quest = new Quest();

    @BeforeEach
    public void init(){
    Answer answer1 = new Answer(1, "Принять вызов");
    Answer answer2 = new Answer(2, "Отклонить вызов");
    Answer answer3 = new Answer(3, "Подняться на мостик");
    Answer answer4 = new Answer(4, "Отказаться подниматься на мостик");
    Answer answer5 = new Answer(5, "Рассказать правду о себе");
    Answer answer6 = new Answer(6, "Солгать о себе");
    Answer answer9 = new Answer(9, "WIN! Начать игру заново?");
    Answer answer10 = new Answer(10, "Game over! Начать игру заново?");
    Answer answer11 = new Answer(11, "");

    Question question1 = new Question(1, "Ты потерял память. Принять вызов НЛО?",
            List.of(answer1, answer2));
    Question question2 = new Question(2, "Ты принял вызов. Поднимаешься на мостик к капитану?",
            List.of(answer3, answer4));
    Question question3 = new Question(3, "Ты поднялся на мостик. Ты кто?",
            List.of(answer5, answer6));
    Question question4 = new Question(4, "Ты отклонил вызов. Поражение",
            List.of(answer10, answer11));
    Question question5 = new Question(5, "Ты не пошел на переговоры. Поражение",
            List.of(answer10, answer11));
    Question question6 = new Question(6, "Тебя вернули домой. Победа",
            List.of(answer9, answer11));
    Question question7 = new Question(7, "Твою ложь разоблачили. Поражение",
            List.of(answer10, answer11));

        answer1.setNextQuestion(question2);
        answer2.setNextQuestion(question4);
        answer3.setNextQuestion(question3);
        answer4.setNextQuestion(question5);
        answer5.setNextQuestion(question6);
        answer6.setNextQuestion(question7);
        answer9.setNextQuestion(question1);
        answer10.setNextQuestion(question1);
        answer11.setNextQuestion(question1);

    List<Question> questions = new ArrayList<>();
        questions.add(question1);
        questions.add(question2);
        questions.add(question3);
        questions.add(question4);
        questions.add(question5);
        questions.add(question6);
        questions.add(question7);

        quest.setQuesions(questions);
}
    @Test
    public void getQuestion(){
        QuestRepository questRepository = new QuestRepository(quest);
        QuestService questService = new QuestService(questRepository);
        Answer answer1 = new Answer(1, "Принять вызов");
        Answer answer2 = new Answer(2,"Отклонить вызов");
//        Question questionExp = new Question(1, "Ты потерял память. Принять вызов НЛО?",
//                List.of(answer1, answer2));

        Question questionExp = questRepository.getQuest().getQuesions().get(0);
        Question result = questService.getQuestion( 0);

        assertEquals(questionExp, result);
    }
}
