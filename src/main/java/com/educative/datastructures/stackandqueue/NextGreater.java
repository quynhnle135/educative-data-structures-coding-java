package com.educative.datastructures.stackandqueue;

public class NextGreater {
    public static int[] findGreater(int[] arr) {
        int[] res = new int[arr.length];
        Stack<Integer> stack = new Stack<>(arr.length);
        for (int i = arr.length - 1; i >=0 ; i--) {
            if (!stack.isEmpty()) {
                while (!stack.isEmpty() && stack.top() <= arr[i]) {
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
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {4, 6, 3, 2, 8, 1, 11};
        int[] res = findGreater(arr);
        for (int i : res) {
            System.out.print(i + " ");
        }
    }
}
