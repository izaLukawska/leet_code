package pl.lukawska.leetcode.hard;

public class LC_123 {
    public int maxProfit(int[] prices) {
        int profitAfterFirstBuy = Integer.MIN_VALUE;
        int profitAfterFirstSell = 0;

        int profitAfterSecondBuy = Integer.MIN_VALUE;
        int profitAfterSecondSell = 0;

        for (int price : prices) {
            profitAfterFirstBuy = Math.max(profitAfterFirstBuy, -price);
            profitAfterFirstSell = Math.max(profitAfterFirstSell, profitAfterFirstBuy + price);

            profitAfterSecondBuy = Math.max(profitAfterSecondBuy, profitAfterFirstSell - price);
            profitAfterSecondSell = Math.max(profitAfterSecondSell, profitAfterSecondBuy + price);
        }

        return profitAfterSecondSell;
    }
}
