package com.educative.datastructures.practice.stackandqueue;

public class Queue <V> {
    private int front;
    private int back;
    private int maxSize;
    private int currentSize;
    private V[] arr;

    // Constructor
    @SuppressWarnings("unchecked")
    Queue(int maxSize) {
        this.front = 0;
        this.back = -1;
        this.maxSize = maxSize;
        this.currentSize = 0;
        arr = (V[]) new Object[maxSize];
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

    public V top() {
        return arr[front];
    }

    // Insert new value to queue
    public void enqueue(V value) {
        if (isFull()) {
            System.out.println("Queue is full!");
            return;
        }
        back = (back + 1) % maxSize;
        arr[back] = value;
        currentSize++;
    }

    // Remove value from queue
    public V dequeue() {
        if(isEmpty()) {
            System.out.println("Queue is empty!");
            return null;
        }
        V temp = arr[front];
        front = (front + 1) % maxSize;
        currentSize--;
        return temp;
    }
}
