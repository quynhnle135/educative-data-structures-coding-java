package com.educative.datastructures.stackandqueue;

public class QueueWithStack <V> {
   Stack<V> stack1;
   Stack<V> stack2;

   // Constructor
    QueueWithStack(int maxSize) {
       stack1 = new Stack<>(maxSize);
       stack2 = new Stack<>(maxSize);
    }

    // Enqueue
    public void enqueue(V value) {
        stack1.push(value);
    }

    // Dequeue
    public V dequeue() {
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        V topValue = stack2.pop();
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
        return topValue;
    }

    public static void main(String[] args) {
        QueueWithStack<Integer> queue = new QueueWithStack<Integer>(5);

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);

        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
    }
}
