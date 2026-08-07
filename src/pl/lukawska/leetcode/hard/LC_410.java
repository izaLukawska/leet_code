package pl.lukawska.leetcode.hard;

public class LC_410 {
    public int splitArray(int[] nums, int k) {
        int left = 0;
        int right = 0;

        for (int num : nums) {
            left = Math.max(left, num);
            right += num;
        }

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (canSplit(nums, k, mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }

    private boolean canSplit(int[] nums, int k, int limit) {
        int groups = 1;
        int sum = 0;

        for (int num : nums) {
            if (sum + num > limit) {
                groups++;
                sum = num;
            } else {
                sum += num;
            }
        }

        return groups <= k;
    }
}
