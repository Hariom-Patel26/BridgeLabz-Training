package com.birdsantuary;
import java.util.ArrayList;

public class Sanctuary {

    private ArrayList<Bird> birds = new ArrayList<>();

    public void addBird(Bird bird) {
        birds.add(bird);
    }

    public void removeBird(int id) {
        birds.removeIf(b -> b.getId() == id);
    }

    public void displayAll() {
        for (Bird b : birds) {
            b.display();
            b.eat();

            if (b instanceof Flyable)
                ((Flyable) b).fly();
            if (b instanceof Swimmable)
                ((Swimmable) b).swim();

            System.out.println();
        }
    }
}