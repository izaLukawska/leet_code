package pl.lukawska.leetcode.medium;

public class LC_209 {
    public int minSubArrayLen(int target, int[] nums) {
        int minLen = Integer.MAX_VALUE;
        int sum = 0;

        int leftIdx = 0;
        for (int rightIdx = 0; rightIdx < nums.length; rightIdx++) {
            sum += nums[rightIdx];

            while (sum >= target) {
                minLen = Math.min(minLen, rightIdx - leftIdx + 1);
                sum -= nums[leftIdx++];
            }
        }

        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }
}
