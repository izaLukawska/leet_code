package pl.lukawska.leetcode.medium;

public class LC_423 {

    private static final int[] DIGIT_ORDER = {0, 2, 4, 6, 8, 3, 5, 7, 9, 1};

    private static final char[] UNIQUE_CHARS = {'z', 'w', 'u', 'x', 'g', 'h', 'f', 's', 'i', 'o'};

    private static final String[] WORDS = {
            "zero", "two", "four", "six", "eight", "three", "five", "seven", "nine", "one"
    };

    public String originalDigits(String s) {
        int[] charFreq = charFreq(s);
        int[] digitFreq = new int[10];

        findDigits(charFreq, digitFreq);
        StringBuilder result = new StringBuilder();

        for (int digit = 0; digit <= 9; digit++) {
            result.repeat(String.valueOf(digit), digitFreq[digit]);
        }

        return result.toString();
    }

    private void findDigits(int[] charFreq, int[] digitFreq) {
        for (int i = 0; i < DIGIT_ORDER.length; i++) {
            int count = charFreq[UNIQUE_CHARS[i] - 'a'];
            digitFreq[DIGIT_ORDER[i]] = count;
            removeDigitChars(charFreq, count, WORDS[i]);
        }
    }

    private void removeDigitChars(int[] charFreq, int count, String digitWord) {
        for (char c : digitWord.toCharArray()) {
            charFreq[c - 'a'] -= count;
        }
    }

    private int[] charFreq(String s) {
        int[] charFreq = new int[26];

        for (char c : s.toCharArray()) {
            charFreq[c - 'a']++;
        }

        return charFreq;
    }
}
