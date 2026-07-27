package pl.lukawska.leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://leetcode.com/problems/permutations-ii/submissions/1670586488/
public class LC_47 {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        boolean[] used = new boolean[nums.length];
        backtrack(nums, new ArrayList<>(), used, result);

        return result;
    }

    private void backtrack(int[] nums, List<Integer> path, boolean[] used, List<List<Integer>> result) {
        if (path.size() == nums.length) {
            result.add(new ArrayList<>(path));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (used[i] || i > 0 && nums[i] == nums[i - 1] && !used[i - 1]) {
                continue;
            }

            path.add(nums[i]);
            used[i] = true;

            backtrack(nums, path, used, result);

            used[i] = false;
            path.removeLast();
        }
    }
}
