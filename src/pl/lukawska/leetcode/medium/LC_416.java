package pl.lukawska.leetcode.medium;

public class LC_416 {
    public boolean canPartition(int[] nums) {
        int total = getSum(nums);

        if (total % 2 != 0) {
            return false;
        }

        int target = total / 2;
        boolean[] dp = new boolean[target + 1];
        dp[0] = true;

        for (int num : nums) {
            for (int sum = target; sum >= num; sum--) {
                dp[sum] = dp[sum] || dp[sum - num];
            }
        }

        return dp[target];
    }

    private int getSum(int[] nums) {
        int sum = 0;

        for (int num : nums) {
            sum += num;
        }

        return sum;
    }
}
