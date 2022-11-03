package com.educative.datastructures.practice.stackandqueue;

public class ReverseKElements {
    public static <V> void reverseK(Queue<V> queue, int k) {
        if (queue.isEmpty() || k <= 0) {
            return;
        }
        Stack<V> stack = new Stack<>(k);
        while (!stack.isFull()) {
            stack.push(queue.dequeue());
        }

        while (!stack.isEmpty()) {
            queue.enqueue(stack.pop());
        }
        int size = queue.getCurrentSize();
        for (int i = 0; i < size - k; i++) {
            queue.enqueue(queue.dequeue());
        }
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<>(10);
        for (int i = 1; i <= 10; i++) {
            queue.enqueue(i);
        }
//        System.out.println("Queue before reversed: ");
//        while (!queue.isEmpty()) {
//            System.out.print(queue.dequeue() + " ");
//        }
//        System.out.println();
        reverseK(queue, 5);
        System.out.println("Queue after reversed: ");
        while (!queue.isEmpty()) {
            System.out.print(queue.dequeue() + " ");
        }

    }
}
