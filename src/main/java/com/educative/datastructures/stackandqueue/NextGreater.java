package com.educative.datastructures.stackandqueue;

public class NextGreater {
    public static int[] findGreater(int[] arr) {
        int[] res = new int[arr.length];
        Stack<Integer> stack = new Stack<>(arr.length);
        int popCount = 0;
        for (int i = arr.length - 1; i >=0 ; i--) {
            if (!stack.isEmpty()) {
                while (!stack.isEmpty() && stack.top() <= arr[i]) {
                    popCount++;
                    stack.pop();
                }
            }
            if (stack.isEmpty()) {
                res[i] = -1;
            } else {
                res[i] = stack.top();
            }
            stack.push(arr[i]);
        }
        System.out.println(popCount);
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {27, 1, 2, 3, 4, 5, 26, 6, 7, 8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25};
        int[] res = findGreater(arr);
        for (int i : res) {
            System.out.print(i + " ");
        }
    }
}
