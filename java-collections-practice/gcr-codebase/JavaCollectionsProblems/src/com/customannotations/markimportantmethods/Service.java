package com.customannotations.markimportantmethods;

public class Service {

    @ImportantMethod
    void criticalTask() {}

    @ImportantMethod(level = "LOW")
    void minorTask() {}
}