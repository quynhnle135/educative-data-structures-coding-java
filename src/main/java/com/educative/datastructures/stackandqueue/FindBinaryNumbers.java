package com.educative.datastructures.stackandqueue;

public class FindBinaryNumbers {
    public static String[] findBin(int number) {
        String[] result = new String[number];
        Queue<String> queue = new Queue<>(number + 1);
        queue.enqueue("1");
        for (int i = 0; i < number; i++) {
            result[i] = queue.dequeue();
            String s1 = result[i] + "0";
//            System.out.println(s1);
            String s2 = result[i] + "1";
//            System.out.println(s2);
            queue.enqueue(s1);
            queue.enqueue(s2);
        }
        return result;
    }

    public static void main(String[] args) {
        String[] output = findBin(3);
        for (String s : output) {
            System.out.println(s);
        }
    }
}
