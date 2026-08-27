package pl.lukawska.leetcode.medium;

import java.util.ArrayDeque;
import java.util.Deque;

public class LC_316 {
    public String removeDuplicateLetters(String s) {
        int[] lastCharIdx = getLastCharIdx(s);

        Deque<Character> stack = new ArrayDeque<>();
        boolean[] seen = new boolean[26];
        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            if (seen[curr - 'a']) {
                continue;
            }
            while (!stack.isEmpty() && stack.peek() > curr && lastCharIdx[stack.peek() - 'a'] > i) {
                seen[stack.pop() - 'a'] = false;
            }

            stack.push(curr);
            seen[curr - 'a'] = true;
        }

        return stackToString(stack);

    }

    private String stackToString(Deque<Character> stack) {
        StringBuilder result = new StringBuilder();

        while (!stack.isEmpty()) {
            result.append(stack.removeLast());
        }

        return result.toString();
    }

    private int[] getLastCharIdx(String s) {
        int[] lastCharIdx = new int[26];
        for (int i = 0; i < s.length(); i++) {
            lastCharIdx[s.charAt(i) - 'a'] = i;
        }

        return lastCharIdx;
    }
}
