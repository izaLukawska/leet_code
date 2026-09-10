package pl.lukawska.leetcode.medium;

public class LC_413 {
    public int numberOfArithmeticSlices(int[] nums) {
        int len = nums.length;
        if (len < 3) {
            return 0;
        }

        int count = 0;
        int currentRun = 0;

        for (int i = 2; i < len; i++) {
            if (nums[i] - nums[i - 1] == nums[i - 1] - nums[i - 2]) {
                currentRun++;
                count += currentRun;
            } else {
                currentRun = 0;
            }
        }

        return count;
    }
}
