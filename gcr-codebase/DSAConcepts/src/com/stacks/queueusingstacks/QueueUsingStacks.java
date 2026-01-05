package com.stacks.queueusingstacks;
class QueueUsingStacks {
    private Stack stackEnqueue;
    private Stack stackDequeue;

    // Constructor
    public QueueUsingStacks(int size) {
        stackEnqueue = new Stack(size);
        stackDequeue = new Stack(size);
    }

    // Enqueue operation
    public void enqueue(int data) {
        stackEnqueue.push(data);
        System.out.println(data + " enqueued");
    }

    // Dequeue operation
    public int dequeue() {
        if (stackDequeue.isEmpty()) {
            while (!stackEnqueue.isEmpty()) {
                stackDequeue.push(stackEnqueue.pop());
            }
        }

        if (stackDequeue.isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }

        return stackDequeue.pop();
    }
    public int peek() {
        // If dequeue stack is empty, transfer elements
        if (stackDequeue.isEmpty()) {
            while (!stackEnqueue.isEmpty()) {
                stackDequeue.push(stackEnqueue.pop());
            }
        }

        // If still empty, queue is empty
        if (stackDequeue.isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }

        // Return front element without removing
        return stackDequeue.peek();
    }

}
