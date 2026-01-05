package com.stacks.stockspanproblem;
class Stack {
    private int[] arr;
    private int top;
    private int size;

    public Stack(int size) {
        this.size = size;
        arr = new int[size];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(int value) {
        arr[++top] = value;
    }

    public int pop() {
        return arr[top--];
    }

    public int peek() {
        return arr[top];
    }
}
