package com.example.fin_quest.entities;

public class Answer {
    private int id;
    private String text;
    private Question nextQuestion;

    public Answer(int id, String answer) {
        this.id = id;
        this.text = answer;
    }

    public Question getNextQuestion() {
        return nextQuestion;
    }

    public void setNextQuestion(Question nextQuestion) {
        this.nextQuestion = nextQuestion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
