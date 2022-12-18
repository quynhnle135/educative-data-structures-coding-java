package com.educative.datastructures.review.stack;

public class NextGreaterElement {
    public static int[] nextGreaterElement(int[] arr) {
        int[] result = new int[arr.length];
        int index = 0;
        Stack<Integer> stack = new Stack<>(arr.length);
        for (int i = arr.length - 1; i >= 0; i--) {
            if (!stack.isEmpty()) {
                while (!stack.isEmpty() && stack.top() > arr[index]) {
                    result[index++] = stack.top();
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 6, 3, 2, 8, 1};
        int[] res = nextGreaterElement(arr);
        for (int n : res) {
            System.out.print(n + " ");
        }
    }
}
