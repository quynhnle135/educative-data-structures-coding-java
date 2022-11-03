//package com.educative.datastructures.stackandqueue;
//import java.lang.Integer;
//
//public class SortInStack {
//    public static <Integer> void sort(Stack<Integer> stack) {
//        Stack<Integer> newStack = new Stack<>(stack.getMaxSize());
//        while (!stack.isEmpty()) {
//            Integer value = stack.pop();
//            int comp =
//            if (!newStack.isEmpty() && (value >= newStack.top())) {
//                newStack.push(value);
//            } else {
//                while (!newStack.isEmpty() && newStack.top() > value)
//                    stack.push(newStack.pop());
//                newStack.push(value);
//            }
//        }
//        while (!newStack.isEmpty())
//            stack.push(newStack.pop());
//    }
//}
