package com.stacks.stockspanproblem;
class StockSpan {

    public static int[] calculateSpan(int[] price) {
        int n = price.length;
        int[] span = new int[n];

        Stack stack = new Stack(n);

        // First day span is always 1
        span[0] = 1;
        stack.push(0);

        for (int i = 1; i < n; i++) {

            // Pop while price at stack top <= current price
            while (!stack.isEmpty() && price[stack.peek()] <= price[i]) {
                stack.pop();
            }

            // If stack empty, span is i + 1
            span[i] = stack.isEmpty() ? (i + 1) : (i - stack.peek());

            // Push current index
            stack.push(i);
        }

        return span;
    }
}
