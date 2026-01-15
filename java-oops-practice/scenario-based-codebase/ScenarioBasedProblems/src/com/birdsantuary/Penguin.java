package com.birdsantuary;
public class Penguin extends Bird implements Swimmable {

    public Penguin(String name, int id) {
        super(name, "Penguin", id);
    }

    public void swim() {
        System.out.println(name + " is swimming.");
    }

    public void display() {
        System.out.println(id + " " + name + " Penguin (Swimmable)");
    }
}