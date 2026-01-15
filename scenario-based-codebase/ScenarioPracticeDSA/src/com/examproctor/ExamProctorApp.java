package com.examproctor;

import java.util.HashMap;
import java.util.Scanner;

public class ExamProctorApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QuestionNavigation navigation = new QuestionNavigation();
        AnswerStore answerStore = new AnswerStore();
        ScoreEvaluator evaluator = new ScoreEvaluator();

        HashMap<Integer, String> correctAnswers = new HashMap<>();
        correctAnswers.put(1, "A");
        correctAnswers.put(2, "B");
        correctAnswers.put(3, "C");

        while (true) {
            System.out.println("1. Visit Question");
            System.out.println("2. Submit Answer");
            System.out.println("3. Last Visited Question");
            System.out.println("4. Submit Exam");
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                System.out.print("Enter question ID: ");
                int qid = sc.nextInt();
                navigation.visitQuestion(qid);
            } 
            else if (choice == 2) {
                System.out.print("Enter question ID: ");
                int qid = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter answer: ");
                String ans = sc.nextLine();
                answerStore.storeAnswer(qid, ans);
            } 
            else if (choice == 3) {
                Integer last = navigation.getLastVisitedQuestion();
                System.out.println(last == null ? "No navigation history" : last);
            } 
            else if (choice == 4) {
                int score = evaluator.calculateScore(answerStore.getAnswers(), correctAnswers);
                System.out.println("Final Score: " + score);
                break;
            } 
            else {
                System.out.println("Invalid choice");
            }
        }
        sc.close();
    }
}
