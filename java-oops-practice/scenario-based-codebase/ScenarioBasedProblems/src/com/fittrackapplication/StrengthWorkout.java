package com.fittrackapplication;

public class StrengthWorkout extends Workout {

    public StrengthWorkout(int duration) {
        super("Strength", duration);
    }

    @Override
    public void calculateCalories() {
        caloriesBurned = duration * 5; 
    }
}
