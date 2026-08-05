package pl.lukawska.leetcode.medium;

public class LC_152 {
    public int maxProduct(int[] nums) {
        int n = nums.length;

        int maxSoFar = nums[0];
        int minSoFar = nums[0];
        int result = nums[0];

        for (int i = 1; i < n; i++) {
            int num = nums[i];

            if (num < 0) {
                int temp = maxSoFar;
                maxSoFar = minSoFar;
                minSoFar = temp;
            }

            maxSoFar = Math.max(num, maxSoFar * num);
            minSoFar = Math.min(num, minSoFar * num);

            result = Math.max(result, maxSoFar);
        }

        return result;
    }
}
