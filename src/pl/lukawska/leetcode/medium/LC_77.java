package pl.lukawska.leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class LC_77 {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), n, 1, k);

        return result;
    }

    private void backtrack(List<List<Integer>> result, List<Integer> path, int n, int num, int k) {
        if (path.size() == k) {
            result.add(new ArrayList<>(path));
            return;
        }

        for (int i = num; i <= n; i++) {
            path.add(i);
            backtrack(result, path, n, i + 1, k);
            path.removeLast();
        }
    }
}
