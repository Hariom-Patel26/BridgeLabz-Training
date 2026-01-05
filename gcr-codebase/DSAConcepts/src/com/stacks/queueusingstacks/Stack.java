package com.stacks.queueusingstacks;
class Stack {
    private int top;
    private int[] arr;
    private int size;

    // Constructor
    public Stack(int size) {
        this.size = size;
        arr = new int[size];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public void push(int data) {
        if (isFull()) {
            System.out.println("Stack Overflow");
            return;
        }
        arr[++top] = data;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return arr[top--];
    }

    public int peek() {
        if (isEmpty()) {
            return -1;
        }
        return arr[top];
    }
}
