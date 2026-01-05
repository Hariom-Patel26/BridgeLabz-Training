package com.stacks.sortstackusingrecursion;
class SortStack {

    // Function to sort the stack
    public static void sortStack(Stack stack) {
        if (!stack.isEmpty()) {
            int temp = stack.pop();
            sortStack(stack);
            sortedInsert(stack, temp);
        }
    }

    // Function to insert element at correct position
    private static void sortedInsert(Stack stack, int element) {
        if (stack.isEmpty() || element > stack.peek()) {
            stack.push(element);
            return;
        }

        int temp = stack.pop();
        sortedInsert(stack, element);
        stack.push(temp);
    }
}
