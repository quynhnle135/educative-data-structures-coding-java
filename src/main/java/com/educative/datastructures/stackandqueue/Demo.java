package com.educative.datastructures.stackandqueue;

public class Demo {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>(10);
        stack.push(1);
        stack.push(4);
        stack.push(5);
        stack.push(2);
        stack.push(7);
        stack.push(10);
        stack.push(9);
        stack.push(6);
        stack.push(2);
        stack.push(8);
        Stack<Integer> newStack = new Stack<>(stack.getMaxSize());
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
        while (!newStack.isEmpty()) {
            System.out.print(newStack.pop() + " ");
        }
        System.out.println();
        System.out.println("Is new stack empty? " + newStack.isEmpty());
    }
}
