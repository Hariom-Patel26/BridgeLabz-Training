package com.examproctor;

import java.util.HashMap;

public class AnswerStore {
    private HashMap<Integer, String> answerMap = new HashMap<>();

    public void storeAnswer(int questionId, String answer) {
        answerMap.put(questionId, answer);
    }

    public HashMap<Integer, String> getAnswers() {
        return answerMap;
    }
}
