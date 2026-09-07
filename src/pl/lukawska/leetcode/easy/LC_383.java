package pl.lukawska.leetcode.easy;

public class LC_383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] ransomNoteCharFreq = charFreq(ransomNote);
        int[] magazineCharFreq = charFreq(magazine);

        for (int i = 0; i < magazineCharFreq.length; i++) {
            if (magazineCharFreq[i] < ransomNoteCharFreq[i]) {
                return false;
            }
        }

        return true;
    }

    private int[] charFreq(String s) {
        int[] result = new int[26];

        for (char c : s.toCharArray()) {
            result[c - 'a']++;
        }

        return result;
    }
}
