package pl.lukawska.leetcode.medium;

public class LC_213 {
    public int rob(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }

        return Math.max(robRange(nums, 0, nums.length - 1), robRange(nums, 1, nums.length));
    }

    private int robRange(int[] nums, int start, int end) {
        int planA = 0;
        int planB = 0;

        for (int i = start; i < end; i++) {
            int currRob = Math.max(planB, planA + nums[i]);
            planA = planB;
            planB = currRob;
        }

        return Math.max(planA, planB);
    }
}
