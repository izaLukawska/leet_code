package pl.lukawska.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class LC_409 {
    public int longestPalindrome(String s) {
        Map<Character, Integer> charFreq = charFreq(s);
        int len = 0;
        boolean hasOddChar = false;

        for (Map.Entry<Character, Integer> c : charFreq.entrySet()) {
            int freq = c.getValue();
            if (freq % 2 == 0) {
                len += freq;
            } else {
                len += freq - 1;
                hasOddChar = true;
            }
        }

        return hasOddChar ? len + 1 : len;
    }

    private Map<Character, Integer> charFreq(String s) {
        Map<Character, Integer> charFreq = new HashMap<>();

        for (char c : s.toCharArray()) {
            charFreq.merge(c, 1, Integer::sum);
        }

        return charFreq;
    }
}
