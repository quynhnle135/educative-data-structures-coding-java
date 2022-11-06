package com.educative.datastructures.practice.stackandqueue;

public class Queue <V> {
    private int maxSize;
    private int currentSize;
    private int front;
    private int back;
    private V[] array;

    // Constructor
    @SuppressWarnings("unchecked")
    public Queue(int maxSize) {
        this.maxSize = maxSize;
        this.currentSize = 0;
        this.front = 0;
        this.back = -1;
        array = (V[]) new Object[maxSize];
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

    public void enqueue(V value) {
        if (isFull()) {
            System.out.println("Queue is full!");
            return;
        }
        back = (back + 1) % maxSize;
        array[back] = value;
        currentSize++;
    }

    public V dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return null;
        }
        V temp = array[front];
        front = (front + 1) % maxSize;
        currentSize--;
        return temp;
    }
}
