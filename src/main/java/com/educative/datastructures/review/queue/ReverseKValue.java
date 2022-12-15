package com.educative.datastructures.review.queue;

import com.educative.datastructures.graphs.Stack;

public class ReverseKValue {
    // 1,2,3,4,5,6,7,8,9,10; k = 5
    // output: 5 4 3 2 1 6 7 8 9 10
    public static void reverseKValue(Queue<Integer> queue, int k) {
        Stack<Integer> stack = new Stack<>(k);
        while (!stack.isFull()) {
            stack.push(queue.dequeue());
        }
        while (!stack.isEmpty()) {
            queue.enqueue(stack.pop());
        }
        for (int i = 1; i <= k; i++) {
            queue.enqueue(queue.dequeue());
        }
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<>(10);
        for (int i = 1; i <= 10; i++) {
            queue.enqueue(i);
        }
        reverseKValue(queue, 5);
        while(!queue.isEmpty()) {
            System.out.print(queue.dequeue() + " ");
        }
    }
}
