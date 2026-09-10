package pl.lukawska.leetcode.medium;

public class LC_424 {
    public int characterReplacement(String s, int k) {
        int[] charFrequency = new int[26];
        int windowStart = 0;
        int mostFrequentCharCount = 0;
        int longestWindow = 0;

        for (int windowEnd = 0; windowEnd < s.length(); windowEnd++) {
            int endCharIndex = s.charAt(windowEnd) - 'A';
            charFrequency[endCharIndex]++;

            mostFrequentCharCount = Math.max(mostFrequentCharCount, charFrequency[endCharIndex]);

            while ((windowEnd - windowStart + 1) - mostFrequentCharCount > k) {
                int startCharIndex = s.charAt(windowStart) - 'A';
                charFrequency[startCharIndex]--;
                windowStart++;
            }

            longestWindow = Math.max(longestWindow, windowEnd - windowStart + 1);
        }

        return longestWindow;
    }
}
