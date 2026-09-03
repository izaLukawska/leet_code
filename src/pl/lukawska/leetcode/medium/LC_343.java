package pl.lukawska.leetcode.medium;

public class LC_343 {
    public int integerBreak(int n) {
        int[] dp = new int[n + 1];
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                int withoutBreaking = j * (i - j);
                int withBreaking = j * dp[i - j];

                dp[i] = Math.max(dp[i], Math.max(withoutBreaking, withBreaking));
            }
        }

        return dp[n];
    }
}
