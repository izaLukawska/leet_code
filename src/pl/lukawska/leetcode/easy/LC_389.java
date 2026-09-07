package pl.lukawska.leetcode.easy;

public class LC_389 {
    public char findTheDifference(String s, String t) {
        int[] charFreq = new int[26];

        for (char c : s.toCharArray()) {
            charFreq[c - 'a']++;
        }

        for (char c : t.toCharArray()) {
            charFreq[c - 'a']--;
        }

        for (int i = 0; i < charFreq.length; i++) {
            if (charFreq[i] != 0) {
                return (char) ('a' + i);
            }
        }

        return 'a';
    }
}
