package com.fittrackapplication;

public class FitTrackApp {

    public static void main(String[] args) {

        UserProfile user = new UserProfile(
                "Hariom",
                22,
                70.5,
                "Weight Loss"
        );

        Workout cardio = new CardioWorkout(30);
        cardio.startWorkout();
        cardio.calculateCalories();
        cardio.stopWorkout();

        double dailyTarget = 500;

        // Operator usage
        double progress = dailyTarget - cardio.getCaloriesBurned();

        System.out.println("Calories Burned: " + cardio.getCaloriesBurned());
        System.out.println("Remaining Calories to Target: " + progress);
        System.out.println("Goal: " + user.getGoal());
    }
}
