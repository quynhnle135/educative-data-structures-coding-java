package com.educative.datastructures.stackandqueue;

public class NextGreater {
    public static int[] findGreater(int[] arr) {
        Stack<Integer> stack = new Stack<>(arr.length);
        int[] result = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            if (!stack.isEmpty()) {
                while (!stack.isEmpty() && stack.top() <= arr[i]) {
                    stack.pop();
                }
            }
            if (stack.isEmpty()) {
                result[i] = -1;
            } else {
                result[i] = stack.top();
            }
            stack.push(arr[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {4, 6, 3, 2, 8, 1, 11};
        int[] res = findGreater(arr);
        for (int i : res) {
            System.out.print(i + " ");
        }
    }
}
