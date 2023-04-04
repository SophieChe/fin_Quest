package com.example.fin_quest.repository;
import com.example.fin_quest.entities.Answer;
import com.example.fin_quest.entities.Quest;
import com.example.fin_quest.entities.Question;
import java.util.ArrayList;
import java.util.List;

public class QuestRepository {
    private final Quest quest;
    public QuestRepository(Quest quest){
        this.quest = quest;
    }
    public Quest getQuest(){

        return quest;

    }
}
