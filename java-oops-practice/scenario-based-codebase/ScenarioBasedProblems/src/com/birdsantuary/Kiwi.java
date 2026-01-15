package com.birdsantuary;
public class Kiwi extends Bird {

    public Kiwi(String name, int id) {
        super(name, "Kiwi", id);
    }

    public void display() {
        System.out.println(id + " " + name + " Kiwi (Neither)");
    }
}