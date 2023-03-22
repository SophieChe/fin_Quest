package com.example.fin_quest.entities;

public class Answer {
    private int id;
    private String answer;

    public Answer(int id, String answer) {
        this.id = id;
        this.answer = answer;
    }

    public Question getNextQuestion() {
        return nextQuestion;
    }

    public void setNextQuestion(Question nextQuestion) {
        this.nextQuestion = nextQuestion;
    }

    private Question nextQuestion;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
