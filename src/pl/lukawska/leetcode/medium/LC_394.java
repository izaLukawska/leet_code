package pl.lukawska.leetcode.medium;

import java.util.ArrayDeque;
import java.util.Deque;

public class LC_394 {
    public String decodeString(String s) {
        Deque<Integer> repetitions = new ArrayDeque<>();
        Deque<String> strings = new ArrayDeque<>();

        StringBuilder current = new StringBuilder();
        int number = 0;

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                number = number * 10 + (c - '0');
            } else if (c == '[') {
                repetitions.push(number);
                strings.push(current.toString());

                number = 0;
                current = new StringBuilder();
            } else if (c == ']') {
                int repeat = repetitions.pop();
                String previous = strings.pop();
                current = new StringBuilder(previous + current.toString().repeat(repeat));

            } else {
                current.append(c);
            }
        }

        return current.toString();
    }
}
