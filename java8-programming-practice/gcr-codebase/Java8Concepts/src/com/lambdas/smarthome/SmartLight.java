package com.lambdas.smarthome;

public class SmartLight {

    private String name;

    public SmartLight(String name) {
        this.name = name;
    }

    public void applyBehavior(LightBehavior behavior, String trigger) {
        behavior.react(trigger);
    }

    @Override
    public String toString() {
        return " [" + name + " status updated]";
    }
}
