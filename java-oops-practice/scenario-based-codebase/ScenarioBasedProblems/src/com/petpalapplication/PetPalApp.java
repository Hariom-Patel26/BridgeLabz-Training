package com.petpalapplication;

public class PetPalApp {

    public static void main(String[] args) {

        Pet dog = new Dog("Buddy", 3);
        Pet cat = new Cat("Kitty", 2);
        Pet bird = new Bird("Tweety", 1);

        dog.makeSound();
        dog.feed();
        dog.play();
        dog.getStatus();

        System.out.println("==============");

        cat.makeSound();
        cat.sleep();
        cat.getStatus();

        System.out.println("==============");

        bird.makeSound();
        bird.play();
        bird.getStatus();
    }
}
