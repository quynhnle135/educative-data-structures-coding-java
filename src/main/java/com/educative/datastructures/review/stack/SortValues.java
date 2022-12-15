package com.educative.datastructures.review.stack;

import java.util.Arrays;

public class SortValues {


    // stack = {1, 3, 5, 2, 5, 7, 9, 11, 24}
    // output: 1, 2, 3, 5, 5, 7, 9, 11, 24
    public static void sortStack(Stack<Integer> stack) {
        int[] arr = new int[stack.getMaxSize()];
        int index = 0;
        while (!stack.isEmpty()) {
            arr[index++] = stack.pop();
        }
        Arrays.sort(arr);
        while (!stack.isFull()) {
            for (int i = index - 1; i >= 0; i--) {
                stack.push(arr[i]);
            }
        }
    }
    // stack = 97
    // value =
    // newStack = 23 12 42 4 60 2
    // output = {2,4,12,23,42,60,97}
    public static void sortValueInStack(Stack<Integer> stack) {
        Stack<Integer> newStack = new Stack<>(stack.getMaxSize());
        while (!stack.isEmpty()) {
            Integer value = stack.pop();
            if (!newStack.isEmpty() && value >= newStack.top()) {
                newStack.push(value);
            } else {
                while (!newStack.isEmpty() && newStack.top() > value) {
                    stack.push(newStack.pop());
                }
                newStack.push(value);
            }
        }
        while (!newStack.isEmpty()) {
            stack.push(newStack.pop());
        }
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>(7);
        stack.push(2);
        stack.push(97);
        stack.push(4);
        stack.push(42);
        stack.push(12);
        stack.push(60);
        stack.push(23);
//        sortStack(stack);
        sortValueInStack(stack);
        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}
