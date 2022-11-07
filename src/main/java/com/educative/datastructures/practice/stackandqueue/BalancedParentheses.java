package com.educative.datastructures.practice.stackandqueue;

public class BalancedParentheses {
    public static boolean checkParentheses(String s) {
        Stack<Character> stack = new Stack<>(s.length());

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if (currentChar == '}' || currentChar == ')' || currentChar == ']') {
                if (stack.isEmpty()) return false;
                if ((currentChar == '}' && stack.pop() != '{') || (currentChar == ')' && stack.pop() != '(') || (currentChar == ']' && stack.pop() != '[')) {
                    return false;
                }
            }else {
                stack.push(currentChar);
            }
        }
        if (!stack.isEmpty()) return false;
        return true;
    }

    public static void main(String[] args) {
        String s = "{}()";
        System.out.println(checkParentheses(s));
        System.out.println(checkParentheses("{([]}}")); // false
    }
}
