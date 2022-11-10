package com.educative.datastructures.graphs;

public class Stack <V> {
    public int maxSize;
    public int currentSize;
    public int top;
    public V[] array;

    // Constructor
    @SuppressWarnings("unchecked")
    public Stack(int maxSize) {
        this.maxSize = maxSize;
        this.currentSize = 0;
        top = -1;
        array = (V[]) new Object[maxSize];
    }

    public int getMaxSize() {
        return this.maxSize;
    }

    public int getCurrentSize() {
        return this.currentSize;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == maxSize  - 1;
    }

    public V top() {
        return array[top];
    }

    public void push(V value) {
        if (isFull()) {
            System.out.println("Stack is full!");
            return;
        }
        array[++top] = value;
        currentSize++;
    }

    public V pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return null;
        }
        currentSize--;
        return array[top--];
    }
}
