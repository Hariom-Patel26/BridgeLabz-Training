package com.birdsantuary;
public abstract class Bird {
    protected String name;
    protected String species;
    protected int id;

    public Bird(String name, String species, int id) {
        this.name = name;
        this.species = species;
        this.id = id;
    }

    public void eat() {
        System.out.println(name + " is eating.");
    }

    public int getId() {
        return id;
    }

    public abstract void display();
}