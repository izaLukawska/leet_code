package pl.lukawska.leetcode.medium;

import java.util.HashMap;
import java.util.Map;

//https://algo.monster/liteproblems/325
public class LC_325 {
    public static void main(String[] args) {
        System.out.println(maximumSizeSubarraySumEqualsK(new int[]{2, 3, 1, 4, 5}, 5));
        System.out.println(maximumSizeSubarraySumEqualsK(new int[]{1, 2, -3, 3}, 0));
    }

    public static int maximumSizeSubarraySumEqualsK(int[] nums, int k) {
        Map<Integer, Integer> prefixIndex = new HashMap<>();
        prefixIndex.put(0, -1);

        int prefixSum = 0;
        int maxLen = 0;

        for (int i = 0; i < nums.length; i++) {
            prefixSum += nums[i];

            int complement = prefixSum - k;

            if (prefixIndex.containsKey(complement)) {
                maxLen = Math.max(maxLen, i - prefixIndex.get(complement));
            }

            prefixIndex.putIfAbsent(prefixSum, i);
        }

        return maxLen;
    }
}
