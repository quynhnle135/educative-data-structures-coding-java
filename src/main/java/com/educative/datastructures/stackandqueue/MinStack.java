package com.educative.datastructures.stackandqueue;

public class MinStack {
    private int maxSize;
    Stack<Integer> mainStack;
    Stack<Integer> minStack;

    // Constructor
    public MinStack(int maxSize) {
        this.maxSize = maxSize;
        mainStack = new Stack<>(maxSize);
        minStack = new Stack<>(maxSize);
    }

    public int pop() {
        minStack.pop();
        return mainStack.pop();
    }

    public void push(Integer value) {
        mainStack.push(value);
        if (!minStack.isEmpty() && minStack.top() < value) {
            minStack.push(minStack.top());
        } else {
            minStack.push(value);
        }
    }

    public int min() {
        return minStack.pop();
    }
}
