package pl.lukawska.leetcode.medium;

import java.util.*;

//https://leetcode.com/problems/combination-sum-ii/
public class LC_40 {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Set<List<Integer>> result = new HashSet<>();
        Arrays.sort(candidates);
        backtrack(candidates, 0, target, new ArrayList<>(), result);

        return new ArrayList<>(result);
    }

    private void backtrack(int[] candidates, int start, int target, List<Integer> current, Set<List<Integer>> result) {
        if (target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            if (i > start && candidates[i] == candidates[i - 1]) {
                continue;
            }

            if (candidates[i] > target) {
                break;
            }

            current.add(candidates[i]);
            backtrack(candidates, i + 1, target - candidates[i], current, result);
            current.removeLast();
        }
    }
}
