package pl.lukawska.leetcode.medium;

import java.util.Arrays;

//LINK: https://leetcode.com/problems/3sum-closest/description/
public class LC_16 {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int difference = Integer.MAX_VALUE;
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int currSum = nums[i] + nums[left] + nums[right];
                if (currSum == target) {
                    return currSum;
                } else if (currSum < target) {
                    left++;
                } else {
                    right--;
                }

                int currDiff = Math.abs(target - currSum);
                if (currDiff < difference) {
                    difference = currDiff;
                    sum = currSum;
                }
            }
        }

        return sum;
    }
}
