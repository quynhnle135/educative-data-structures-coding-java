package com.educative.datastructures.stackandqueue;

public class TwoStacks <V>{
    private int maxSize;
    private V[] array;
    private int top1, top2;

    @SuppressWarnings("unchecked")
    // Constructor
    public TwoStacks(int max_size) {
        this.maxSize = max_size;
        this.top1 = -1;
        this.top2 = max_size;
        array = (V[]) new Object[max_size];
    }

    public void push1(V value) {
        if (top1 < top2 - 1) {
            array[top1++] = value;
        }
    }

    public void push2(V value) {
        if (top1 < top2 - 1) {
            array[top2--] = value;
        }
    }

    public V pop1() {
        if (top1 > -1) {
            return array[top1--];
        }
        return null;
    }

    public V pop2() {
        if (top2 < maxSize) {
            return array[top2++];
        }
        return null;
    }
}
