package com.edumentor;

public class Learner extends User implements ICertifiable {

    private String courseType; // short / full-time

    public Learner(String name, String email, int userId, String courseType) {
        super(name, email, userId);
        this.courseType = courseType;
    }

    public void attemptQuiz(Quiz quiz, String[] userAnswers) {
        quiz.submitQuiz(userAnswers);
    }

    @Override
    public void generateCertificate() {
        if (courseType.equalsIgnoreCase("short")) {
            System.out.println(" Short Course Certificate generated for " + name);
        } else if (courseType.equalsIgnoreCase("full")) {
            System.out.println(" Full-Time Course Certificate generated for " + name);
        }
        else {
        	System.out.println("Invalid course type, No certificate generated");
        }
    }
}
