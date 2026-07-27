package pl.lukawska.leetcode.medium;

import java.util.*;

//https://leetcode.com/problems/combination-sum/
public class LC_39 {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> result = new ArrayList<>();

        backtrack(candidates, result, new ArrayList<>(),  target, 0);

        return result;
    }

    private void backtrack(int[] candidates, List<List<Integer>> result, List<Integer> path, int target, int idx) {
        if (target < 0) {
            return;
        }

        if (target == 0) {
            result.add(new ArrayList<>(path));
            return;
        }

        for (int i = idx; i < candidates.length; i++) {
            path.add(candidates[i]);

            backtrack(candidates, result, path, target - candidates[i], i);

            path.removeLast();
        }
    }
}
