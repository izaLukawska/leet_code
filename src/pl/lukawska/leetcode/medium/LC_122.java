package pl.lukawska.leetcode.medium;

public class LC_122 {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            int currProfit = prices[i] - prices[i - 1];
            maxProfit += Math.max(0, currProfit);
        }

        return maxProfit;
    }
}
