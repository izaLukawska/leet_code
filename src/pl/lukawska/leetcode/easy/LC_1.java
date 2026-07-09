package pl.lukawska.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

//LINK: https://leetcode.com/problems/two-sum/description/

public class LC_1 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numsIdx = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int reminder = target - nums[i];
            if (numsIdx.containsKey(reminder)) {
                return new int[]{numsIdx.get(reminder), i};
            }

            numsIdx.put(nums[i], i);
        }

        return new int[]{-1, -1};
    }
}
