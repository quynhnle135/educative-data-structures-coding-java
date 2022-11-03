package com.educative.datastructures.stackandqueue;

public class PostfixExpression {
    public static int evaluatePostfix(String expression) {
        Stack<Integer> stack = new Stack<>(expression.length());

        for (int i = 0; i < expression.length(); i++) {
            char character = expression.charAt(i);
            if (!Character.isDigit(character)) {
                Integer x = stack.pop();
                Integer y = stack.pop();

                switch(character) {
                    case '+':
                        stack.push(y + x);
                        break;
                    case '-':
                        stack.push(y - x);
                        break;
                    case '*':
                        stack.push(y * x);
                        break;
                    case '/':
                        stack.push(y / x);
                        break;
                }
            } else {
                stack.push(Character.getNumericValue(character));
            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        String s = "921*-8-4+";
        System.out.println(evaluatePostfix(s));
    }
}
