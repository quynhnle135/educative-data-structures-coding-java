package com.educative.datastructures;

import com.educative.datastructures.practice.stackandqueue.Queue;

public class Draft {
    public static void main(String[] args) {
        String[] myString = new String[5];
        Queue<String> myQueue = new Queue<>(6);
        myQueue.enqueue("1");
        for (int i = 0; i < 5; i++) {
            myString[i] = myQueue.dequeue();
            String s1 = myString[i] + "0";
            String s2 = myString[i] + "1";
            myQueue.enqueue(s1);
            myQueue.enqueue(s2);
        }
        for (String s : myString) {
            System.out.print(s + " ");
        }
        System.out.println();
        String s = "1";
        System.out.println(s + "123");
    }
}
