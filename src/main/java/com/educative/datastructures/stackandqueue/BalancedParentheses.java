package com.educative.datastructures.stackandqueue;

public class BalancedParentheses {
    public static boolean isBalancedParentheses(String parentheses) {
        Stack<Character> stack = new Stack<>(parentheses.length());

        for (int i = 0; i < parentheses.length(); i++) {

            char currentChar = parentheses.charAt(i);

            if (currentChar == ')' || currentChar == ']' || currentChar == '}') {

                if (stack.isEmpty()) return false;

                if ((currentChar == ')' && stack.pop() != '(') || (currentChar == '}' && stack.pop() != '{') || (currentChar == ']' && stack.pop() != '['))  return false;
            }
            else stack.push(currentChar);
        }
        if (!stack.isEmpty()) return false;
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isBalancedParentheses("{[()]}")); // true
        System.out.println(isBalancedParentheses("[{(}]")); // false
    }
}
