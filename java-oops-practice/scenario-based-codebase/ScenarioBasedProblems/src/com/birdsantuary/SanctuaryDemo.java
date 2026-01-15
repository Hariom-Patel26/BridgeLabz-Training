package com.birdsantuary;
public class SanctuaryDemo {

    public static void main(String[] args) {

        Sanctuary s = new Sanctuary();

        s.addBird(new Eagle("Rocky", 1));
        s.addBird(new Duck("Daisy", 2));
        s.addBird(new Penguin("Pingu", 3));
        s.addBird(new Kiwi("Kiko", 4));

        s.displayAll();
    }
}