package com.stacks.queueusingstacks;
public class QueueUsingStacksMain {
    public static void main(String[] args) {

        QueueUsingStacks queue = new QueueUsingStacks(5);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);

        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Dequeued: " + queue.dequeue());

        queue.enqueue(50);

        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Dequeued: " + queue.dequeue());
        
        queue.peek();
    }
}
