package com.educative.datastructures.review.stack;

public class TwoStack<V> {
    private int maxSize;
    private int top1, top2;
    private V[] array;

    // Constructor
    @SuppressWarnings("unchecked")
    public TwoStack(int maxSize) {
        this.maxSize = maxSize;
        this.top1 = -1;
        this.top2 = maxSize;
        array = (V[]) new Object[maxSize];
    }

    public void push1(V value) {
        if (top1 < top2 - 1) {
            array[++top1] = value;
        }
    }

    public void push2(V value) {
        if (top1 < top2 - 1) {
            array[--top2] = value;
        }
    }

    public V pop1() {
        if (top1 > - 1) {
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
    public static void main(String args[]) {
        TwoStack<Integer> tS = new TwoStack<Integer>(5);
        tS.push1(11);
        tS.push1(3);
        tS.push1(7);
        tS.push2(1);
        tS.push2(9);

        System.out.println(tS.pop1());
        System.out.println(tS.pop2());
        System.out.println(tS.pop2());
        System.out.println(tS.pop2());
        System.out.println(tS.pop1());
    }

}
