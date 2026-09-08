package pl.lukawska.leetcode.easy;

public class LC_392 {
    public boolean isSubsequence(String s, String t) {
        if (s.isEmpty()) {
            return true;
        }

        int idx = 0;

        for (char c : t.toCharArray()) {
            if (idx >= s.length()) {
                break;
            }

            if (s.charAt(idx) == c) {
                idx++;
            }
        }

        return idx == s.length();
    }
}
