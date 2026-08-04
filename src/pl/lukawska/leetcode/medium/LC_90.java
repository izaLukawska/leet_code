package pl.lukawska.leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC_90 {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), nums, 0);

        return result;
    }

    private void backtrack(List<List<Integer>> result, List<Integer> path, int[] nums, int idx) {
        result.add(new ArrayList<>(path));

        for (int i = idx; i < nums.length; i++) {
            if (i > idx && nums[i] == nums[i - 1]) {
                continue;
            }

            path.add(nums[i]);

            backtrack(result, path, nums, i + 1);

            path.removeLast();
        }
    }
}
