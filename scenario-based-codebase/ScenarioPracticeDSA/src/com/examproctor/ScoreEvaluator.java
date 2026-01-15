package com.examproctor;

import java.util.HashMap;

public class ScoreEvaluator {

    public int calculateScore(HashMap<Integer, String> answers, HashMap<Integer, String> correctAnswers) {
        int score = 0;
        for (Integer questionId : answers.keySet()) {
            if (answers.get(questionId).equalsIgnoreCase(correctAnswers.get(questionId))) {
                score++;
            }
        }
        return score;
    }
}
