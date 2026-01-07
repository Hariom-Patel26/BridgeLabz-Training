package com.petpalapplication;

import java.util.Random;

public abstract class Pet implements IInteractable {

    protected String name;
    protected String type;
    protected int age;

    private int hunger;  
    private int energy;
    private int mood; 

    // Constructor with random default values
    public Pet(String name, String type, int age) {
        Random random = new Random();
        this.name = name;
        this.type = type;
        this.age = age;
        this.hunger = random.nextInt(50) + 30;
        this.energy = random.nextInt(50) + 30;
        this.mood = random.nextInt(50) + 30;
    }

    // Interaction methods (operators used)
    @Override
    public void feed() {
        hunger -= 10;
        energy += 5;
        mood += 5;
        System.out.println(name + " is eating.");
    }

    @Override
    public void play() {
        energy -= 15;
        hunger += 10;
        mood += 10;
        System.out.println(name + " is playing.");
    }

    @Override
    public void sleep() {
        energy += 20;
        hunger += 5;
        System.out.println(name + " is sleeping.");
    }

    public void getStatus() {
        System.out.println("Hunger: " + hunger +
                " | Energy: " + energy +
                " | Mood: " + mood);
    }
    public abstract void makeSound();
}
