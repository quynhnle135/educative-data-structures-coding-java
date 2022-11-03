package com.educative.datastructures.practice.stackandqueue;

public class Stack <V>{
    private int maxSize;
    private int currentSize;
    private int top;
    private V[] arr;

    //Constructor
    @SuppressWarnings("unchecked")
    Stack(int maxSize) {
        this.maxSize = maxSize;
        this.currentSize = 0;
        this.top = -1;
        arr = (V[]) new Object[maxSize];
    }


    public int getCurrentSize() {
        return currentSize;
    }

    public int getMaxSize() {
        return maxSize;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == maxSize - 1;
    }

    public V top() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return null;
        }
        return arr[top];
    }

    public void push(V value) {
        if (isFull()) {
            System.out.println("Stack is full!");
            return;
        }
        arr[top++] = value;
        currentSize++;
    }

    public V pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return null;
        }
        currentSize--;
        return arr[top--];
    }
}
