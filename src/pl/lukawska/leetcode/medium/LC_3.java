package pl.lukawska.leetcode.medium;

import java.util.HashSet;
import java.util.Set;

//LINK: https://leetcode.com/problems/longest-substring-without-repeating-characters/description/

public class LC_3 {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> seen = new HashSet<>();
        int start = 0;
        int maxLen = Integer.MIN_VALUE;

        for (int end = 0; end < s.length(); end++) {
            char currChar = s.charAt(end);

            while (seen.contains(currChar)) {
                seen.remove(s.charAt(start));
                start++;
            }

            seen.add(currChar);
            maxLen = Math.max(maxLen, seen.size());
        }

        return maxLen;
    }
}
