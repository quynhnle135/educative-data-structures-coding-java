package com.educative.datastructures.stackandqueue;

public class QueueWithStack <V> {
   Stack<V> stack1;
   Stack<V> stack2;

   // Constructor
    QueueWithStack(int maxSize) {
       stack1 = new Stack<>(maxSize);
       stack2 = new Stack<>(maxSize);
    }

    // Check if stack is empty
    public boolean isEmpty() {
        return (stack1.isEmpty() && stack2.isEmpty());
    }

    // Enqueue
    public void enqueue(V value) {
        stack1.push(value);
    }

    // Dequeue
    public V dequeue() {
        if (isEmpty()) {
            return null;
        } else if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
            return stack2.pop();
        } else {
            return stack2.pop();
        }
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
