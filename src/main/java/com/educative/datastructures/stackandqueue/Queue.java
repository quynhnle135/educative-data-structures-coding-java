package com.educative.datastructures.stackandqueue;

public class Queue <V> {
    private int maxSize;
    private V[] array;
    private int front;
    private int back;
    private int currentSize;

    // Constructor
    @SuppressWarnings("unchecked")
    public Queue(int maxSize) {
        this.maxSize = maxSize;
        array = (V[]) new Object[maxSize];
        front = 0;
        back = -1;
        currentSize = 0;
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
        return array[front];
    }

    public void enqueue(V value) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }
        back = (back + 1) % maxSize; // to keep the index in range
        array[back] = value;
        currentSize++;
    }

    public V dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return null;
        }

        V temp = array[front];
        front = (front + 1) % maxSize; // to keep the index in range
        currentSize--;
        return temp;
    }
}
