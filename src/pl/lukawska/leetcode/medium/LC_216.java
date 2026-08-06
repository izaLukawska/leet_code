package pl.lukawska.leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class LC_216 {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<>();
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        backtrack(result, new ArrayList<>(), nums, 0, k, n);

        return result;
    }

    private void backtrack(List<List<Integer>> result, List<Integer> path, int[] nums, int idx, int k, int rest) {
        if (path.size() == k && rest == 0) {
            result.add(new ArrayList<>(path));
            return;
        }

        if (rest < 0 || path.size() == k) {
            return;
        }

        for (int i = idx; i < nums.length; i++) {
            path.add(nums[i]);

            backtrack(result, path, nums, i + 1, k, rest - nums[i]);

            path.removeLast();
        }
    }
}
