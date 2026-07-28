package pl.lukawska.leetcode.medium;

//https://leetcode.com/problems/maximum-subarray/
public class LC_53 {
    public int maxSubArray(int[] nums) {
        int totalMax = nums[0];
        int currMax = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currMax = Math.max(currMax + nums[i], nums[i]);
            totalMax = Math.max(totalMax, currMax);
        }

        return totalMax;
    }
}
