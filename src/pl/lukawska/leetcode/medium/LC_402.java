package pl.lukawska.leetcode.medium;

import java.util.ArrayDeque;
import java.util.Deque;

public class LC_402 {
    public String removeKdigits(String num, int k) {
        if (num.length() == k) {
            return "0";
        }

        Deque<Character> numbers = removeDigits(num, k);
        StringBuilder sb = removeLeadingZeroes(numbers);

        return sb.isEmpty() ? "0" : sb.toString();
    }

    private Deque<Character> removeDigits(String num, int k) {
        Deque<Character> numbers = new ArrayDeque<>();
        for (char c : num.toCharArray()) {
            while (!numbers.isEmpty() && k > 0 && numbers.peekLast() > c) {
                numbers.removeLast();
                k--;
            }
            numbers.offerLast(c);
        }

        while (k > 0 && !numbers.isEmpty()) {
            numbers.removeLast();
            k--;
        }

        return numbers;
    }

    private StringBuilder removeLeadingZeroes(Deque<Character> numbers){
        StringBuilder sb = new StringBuilder();
        boolean leadingZero = true;

        while (!numbers.isEmpty()) {
            char c = numbers.pollFirst();
            if (leadingZero && c == '0') {
                continue;
            }
            leadingZero = false;
            sb.append(c);
        }

        return sb;
    }
}
