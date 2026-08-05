package pl.lukawska.leetcode.medium;

import java.util.ArrayDeque;
import java.util.Deque;

public class LC_150 {
    public int evalRPN(String[] tokens) {
        Deque<Integer> numbers = new ArrayDeque<>();

        for (String token : tokens) {
            if (isOperator(token)) {
                int num1 = numbers.pop();
                int num2 = numbers.pop();
                int result = applyOperation(num2, num1, token);
                numbers.push(result);
            } else {
                numbers.push(Integer.parseInt(token));
            }
        }

        return numbers.pop();
    }

    private boolean isOperator(String symbol) {
        return symbol.equals("+") || symbol.equals("-") || symbol.equals("*") || symbol.equals("/");
    }

    private int applyOperation(int val1, int val2, String operator) {
        return switch (operator) {
            case "+" -> val1 + val2;
            case "-" -> val1 - val2;
            case "*" -> val1 * val2;
            case "/" -> val1 / val2;
            default -> 0;
        };
    }
}
