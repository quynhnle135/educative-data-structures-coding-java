package com.educative.datastructures.practice.graphs;

public class Stack <V>{
    private int maxSize;
    private int currentSize;
    private int top;
    private V[] array;

    @SuppressWarnings("unchecked")
    public Stack(int maxSize) {
        this.maxSize = maxSize;
        currentSize = 0;
        top = -1;
        array = (V[]) new Object[maxSize];
    }

    public boolean isEmpty() {
        return currentSize == 0;
    }

    public boolean isFull() {
        return currentSize == maxSize;
    }

    public int getMaxSize() {
        return maxSize;
    }

    public int getCurrentSize() {
        return currentSize;
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
