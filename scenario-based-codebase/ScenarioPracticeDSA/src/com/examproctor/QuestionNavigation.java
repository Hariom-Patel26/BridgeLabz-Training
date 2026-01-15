package com.examproctor;

import java.util.Stack;

public class QuestionNavigation {
    private Stack<Integer> navigationStack = new Stack<>();

    public void visitQuestion(int questionId) {
        navigationStack.push(questionId);
    }
    public Integer getLastVisitedQuestion() {
        if (navigationStack.isEmpty()) {
            return null;
        }
        return navigationStack.peek();
    }
}
