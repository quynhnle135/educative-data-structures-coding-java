package com.educative.datastructures.practice.stackandqueue;

public class TwoStack <V> {
    private int top1, top2;
    private int maxSize;
    private V[] arr;
    private int currentSize;

    @SuppressWarnings("unchecked")
    TwoStack(int max_size) {
        this.maxSize = max_size;
        this.top1 = -1;
        this.top2 = max_size;
        arr = (V[]) new Object[maxSize];
    }


    // insert at top of first stack
    public void push1(V value) {
        if (top1 < top2 - 1) {
            arr[top1++] = value;
        }
    }
    // insert at top of second stack
    public void push2(V value) {
        if (top1 < top2 - 1) {
            arr[top2--] = value;
        }
    }

    // remove and return from top of the first stack
    public V pop1() {
        if (top1 > -1) {
            return arr[top1--];
        }
        return null;
    }

    // remove and return from top of the second stack
    public V pop2() {
        if (top2 < maxSize) {
            return arr[top2++];
        }
        return null;
    }
}
