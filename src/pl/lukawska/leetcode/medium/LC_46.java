package pl.lukawska.leetcode.medium;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/permutations/
public class LC_46 {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        backtrack(nums, result, new ArrayList<>(), used, 0);
        return result;
    }

    private void backtrack(int[] nums, List<List<Integer>> result, List<Integer> path, boolean[] used, int idx) {
        if (path.size() == nums.length) {
            result.add(new ArrayList<>(path));
            return;
        }

        for (int i = idx; i < nums.length; i++) {
            if (used[i]) {
                continue;
            }

            path.add(nums[i]);
            used[i] = true;

            backtrack(nums, result, path, used, idx);

            used[i] = false;
            path.removeLast();
        }
    }
}
