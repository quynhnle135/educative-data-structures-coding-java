package com.educative.datastructures.practice.stackandqueue;


public class FindBinaryNumber {
    public static String[] findBin(int num) {
        String[] result = new String[num];
        Queue<String> queue = new Queue<String>(num + 1);
        queue.enqueue("1");
        for (int i = 0; i < num; i++) {
            result[i] = queue.dequeue();
            String s1 = result[i] + "0";
            String s2 = result[i] + "1";
            queue.enqueue(s1);
            queue.enqueue(s2);
        }
        return result;
    }

    public static void main(String[] args) {
        String[] res = findBin(5);
        for (String s : res) {
            System.out.print(s + " ");
        }
    }
}
