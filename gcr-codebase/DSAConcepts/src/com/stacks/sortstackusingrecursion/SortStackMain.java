package com.stacks.sortstackusingrecursion;
public class SortStackMain {
    public static void main(String[] args) {

        Stack stack = new Stack(10);

        stack.push(30);
        stack.push(10);
        stack.push(50);
        stack.push(20);
        stack.push(40);

        System.out.println("Original Stack:");
        stack.display();

        SortStack.sortStack(stack);

        System.out.println("Sorted Stack (Ascending):");
        stack.display();
    }
}
