package pl.lukawska.leetcode.medium;

import java.util.HashMap;
import java.util.Map;

public class LC_2461 {
    public long maximumSubarraySum(int[] nums, int k) {
        Map<Integer, Integer> numFreq = new HashMap<>();
        long maxSum = 0;
        long currSum = 0;

        for (int i = 0; i < k; i++) {
            currSum += nums[i];
            numFreq.merge(nums[i], 1, Integer::sum);
        }

        if (numFreq.size() == k) {
            maxSum = currSum;
        }

        for (int i = k; i < nums.length; i++) {
            int prevValue = nums[i - k];
            currSum -= prevValue;
            numFreq.computeIfPresent(prevValue, (key, count) -> count == 1 ? null : count - 1);

            int currValue = nums[i];
            currSum += currValue;
            numFreq.merge(currValue, 1, Integer::sum);

            if (numFreq.size() == k) {
                maxSum = Math.max(maxSum, currSum);
            }
        }

        return maxSum;
    }
}
