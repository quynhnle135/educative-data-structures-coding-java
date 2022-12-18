package com.educative.datastructures.review.stack;

// Manually implement Stack

public class Stack<V> {
    private int maxSize;
    private int top;
    private V array[];

    // Constructor
    @SuppressWarnings("unchecked")
    public Stack(int maxSize) {
        this.maxSize = maxSize;
        this.top = -1;
        array = (V[]) new Object[maxSize];
    }

    public int getMaxSize() {
        return maxSize;
    }

    public boolean isEmpty() {
        return  top == -1;
    }

    public boolean isFull() {
        return top == maxSize - 1;
    }

    public V top() {
        if (isEmpty()) {
            return null;
        }
        return array[top];
    }

    public void push(V value) {
        if (isFull()) {
            System.out.println("Stack is full!!!");
            return;
        }
        array[++top] = value;
    }

    public V pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty!!!");
            return null;
        }
        return array[top--];
    }

    public V peek() {
        return array[top];
    }
}
