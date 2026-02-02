package com.lambdas.smarthome;

@FunctionalInterface
public interface LightBehavior {
    void react(String trigger);
}
