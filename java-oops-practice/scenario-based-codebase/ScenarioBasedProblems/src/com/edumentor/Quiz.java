package com.edumentor;

public class Quiz {

    private String[] questions;  
    private final String[] answers; 
    private int score;
    private String difficulty;

    public Quiz(String[] questions, String[] answers, String difficulty) {
        this.questions = questions;
        this.answers = answers;
        this.difficulty = difficulty;
        this.score = 0;
    }

    public String[] getQuestions() {
        return questions;
    }

    public void submitQuiz(String[] userAnswers) {
        for (int i = 0; i < answers.length; i++) {
            if (answers[i].equalsIgnoreCase(userAnswers[i])) {
                score += 1; 
            }
        }
    }

    public double calculatePercentage() {
        return (score * 100.0) / answers.length;
    }

    public int getScore() {
        return score;
    }
}
