package pl.lukawska.leetcode.easy;

public class LC_70 {
    public int climbStairs(int n) {
        if (n < 3) {
            return n;
        }

        int recentCount = 2;
        int prevCount = 1;

        for (int i = 2; i < n; i++) {
            int currCount = prevCount + recentCount;
            prevCount = recentCount;
            recentCount = currCount;
        }

        return recentCount;
    }
}
