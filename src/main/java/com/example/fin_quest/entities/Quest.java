package com.example.fin_quest.entities;

import java.util.List;

public class Quest {
    private List<Question> questions;

    public List<Question> getQuesions() {
        return questions;
    }

    public void setQuesions(List<Question> questions) {
        this.questions = questions;
    }
}
