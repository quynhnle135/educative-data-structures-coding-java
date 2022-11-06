package com.educative.datastructures.practice.graphs;

public class DemoStack {
    public static void main(String[] args) {
        Stack<Integer> myStack = new Stack<>(5);
        System.out.println(myStack.isEmpty()); // true;
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        myStack.push(5);

        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());

    }
}
