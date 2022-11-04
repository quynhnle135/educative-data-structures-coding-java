package com.educative.datastructures.stackandqueue;

public class BalancedParentheses {
    public static boolean isBalancedParentheses(String parentheses) {
        Stack<Character> stack = new Stack<>(parentheses.length());
        for (int i = 0; i < parentheses.length(); i++) {
            char character = parentheses.charAt(i);

            if (character == '}' || character == ')' || character == ']') {
                if (stack.isEmpty()) {
                    return false;
                } else if ((character == '}' && stack.pop() == '{') || (character == '[' && stack.pop() == ']') || (character == '(' && stack.pop() == ')')) {
                    return true;
                }
            } else {
                stack.push(character);
            }
        }
        if (!stack.isEmpty()) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "{[()]}}";
        System.out.println(isBalancedParentheses(s));
    }
}
