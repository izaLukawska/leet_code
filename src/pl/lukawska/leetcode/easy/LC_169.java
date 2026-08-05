package pl.lukawska.leetcode.easy;

public class LC_169 {
    public int majorityElement(int[] nums) {
        int candidate = nums[0];
        int count = 1;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }

            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }

        return candidate;
    }
}
