package pl.lukawska.leetcode.easy;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

//LINK: https://leetcode.com/problems/valid-parentheses/
public class LC_20 {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();

        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(')');
            } else if (c == '{') {
                stack.push('}');
            } else if (c == '[') {
                stack.push(']');
            } else {
                if (stack.isEmpty() || stack.pop() != c) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
