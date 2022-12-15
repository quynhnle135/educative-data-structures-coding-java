package com.educative.datastructures.review.stack;

public class PostFix {
    public static int calculate(String expression) {
        Stack<Integer> numbers = new Stack<>(expression.length());
        for (int i = 0; i < expression.length(); i++) {
            char currentChar = expression.charAt(i);
            if (!Character.isDigit(currentChar)) {
                int x = numbers.pop();
                int y = numbers.pop();

                switch (currentChar) {
                    case '+':
                        numbers.push(y + x);
                        break;
                    case '-':
                        numbers.push(y - x);
                        break;
                    case '*':
                        numbers.push(y * x);
                        break;
                    case '/':
                        numbers.push(y / x);
                        break;
                }
            }
            else {
                numbers.push(Character.getNumericValue(currentChar));
            }
        }
        return numbers.pop();
    }

    public static void main(String[] args) {
        System.out.println(calculate("921*-8-4+"));
    }
}
