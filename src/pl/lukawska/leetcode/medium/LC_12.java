package pl.lukawska.leetcode.medium;

//LINK: https://leetcode.com/problems/integer-to-roman/
public class LC_12 {

    public String intToRoman(int num) {
        StringBuilder result = new StringBuilder();

        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        for (int i = 0; i < values.length; i++) {
            while (values[i] <= num) {
                result.append(symbols[i]);
                num -= values[i];

            }
        }

        return result.toString();
    }
}

