package com.educative.datastructures.practice.stackandqueue;

public class Stack <V>{
    private int maxSize;
    private int currentSize;
    private V[] array;
    private int top;

    // Constructor
    @SuppressWarnings("unchecked")
    public Stack(int maxSize) {
        this.maxSize = maxSize;
        this.currentSize = 0;
        array = (V[]) new Object[maxSize];
        this.top = -1;
    }
    public int getMaxSize() {
        return maxSize;
    }

    public int getCurrentSize() {
        return currentSize;
    }

    public boolean isEmpty() {
        return currentSize == 0;
    }

    public boolean isFull() {
        return currentSize == maxSize;
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

    public V top() {
        return array[top];
    }
}
