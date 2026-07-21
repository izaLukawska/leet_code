package pl.lukawska.leetcode.medium;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/generate-parentheses/
public class LC_22 {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtrack(result, new StringBuilder(), n, 0, 0);
        return result;
    }

    private void backtrack(List<String> result, StringBuilder combination, int n, int openCount, int closeCount) {
        if (combination.length() == n * 2) {
            result.add(combination.toString());
            return;
        }

        if (openCount < n) {
            combination.append('(');
            backtrack(result, combination, n, openCount + 1, closeCount);
            combination.deleteCharAt(combination.length() - 1);
        }

        if (closeCount < openCount) {
            combination.append(')');
            backtrack(result, combination, n, openCount, closeCount + 1);
            combination.deleteCharAt(combination.length() - 1);
        }
    }
}
