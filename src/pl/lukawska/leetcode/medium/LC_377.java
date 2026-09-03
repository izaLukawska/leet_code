package pl.lukawska.leetcode.medium;

import java.util.Arrays;

public class LC_377 {
    public int combinationSum4(int[] nums, int target) {
        int[] memo = new int[target + 1];
        Arrays.fill(memo, -1);

        return backtrack(nums, target, 0, memo);
    }

    private int backtrack(int[] nums, int target, int sum, int[] memo) {
        if (sum == target) {
            return 1;
        }

        if (sum > target) {
            return 0;
        }

        if (memo[sum] != -1) {
            return memo[sum];
        }

        int count = 0;

        for (int num : nums) {
            count += backtrack(nums, target, sum + num, memo);
        }

        memo[sum] = count;

        return count;
    }
}
