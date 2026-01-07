package com.edumentor;

import java.util.Scanner;

public class EduMentorApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Learner Input
        System.out.print("Enter Learner Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Email: ");
        String email = sc.nextLine();

        System.out.print("Enter User ID: ");
        int userId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Course Type (short/full-time): ");
        String courseType = sc.nextLine();

        Learner learner = new Learner(name, email, userId, courseType);

        String[] questions = {
                "What is JVM?",
                "What is OOP?"
        };

        String[] correctAnswers = {
                "Java Virtual Machine",
                "Object Oriented Programming"
        };

        Quiz quiz = new Quiz(questions, correctAnswers, "Easy");

        // User answers
        String[] userAnswers = new String[questions.length];

        System.out.println("\n--- Quiz Started ---");
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            userAnswers[i] = sc.nextLine();
        }

        learner.attemptQuiz(quiz, userAnswers);

        int result = quiz.getScore();
        System.out.println("\nScore: " + result);
        System.out.println("Percentage: " + quiz.calculatePercentage() + "%");
        
        if (result != 0) {
        learner.generateCertificate();
        }
        else {
        	System.out.println("The score is zero, hence no certificate generated");
        }

        sc.close();
    }
}
