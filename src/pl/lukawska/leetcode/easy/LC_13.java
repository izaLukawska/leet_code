package pl.lukawska.leetcode.easy;

import java.util.Map;

public class LC_13 {

    private static final Map<Character, Integer> SYMBOLS = Map.of('I', 1,
                                                                  'V', 5,
                                                                  'X', 10,
                                                                  'L', 50,
                                                                  'C', 100,
                                                                  'D', 500,
                                                                  'M', 1000);

    public int romanToInt(String s) {
        int result = 0;
        int prev = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int curr = SYMBOLS.get(s.charAt(i));

            if (curr < prev) {
                result -= curr;
            } else {
                result += curr;
            }

            prev = curr;
        }

        return result;
    }
}
