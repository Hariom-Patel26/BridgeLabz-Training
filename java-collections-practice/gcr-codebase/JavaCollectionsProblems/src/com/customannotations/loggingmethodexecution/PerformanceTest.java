package com.customannotations.loggingmethodexecution;

public class PerformanceTest {

    @LogExecutionTime
    void heavyTask() {
        for (int i = 0; i < 1_000_000; i++);
    }
}