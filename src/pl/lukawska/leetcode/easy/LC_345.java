package pl.lukawska.leetcode.easy;

public class LC_345 {

    private static final char[] VOWELS = new char[]{'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u'};

    public String reverseVowels(String s) {
        char[] letters = s.toCharArray();
        int left = 0;
        int right = letters.length - 1;

        while (left < right) {
            while (left < right && isNotVowel(letters[left])) {
                left++;
            }

            while (left < right && isNotVowel(letters[right])) {
                right--;
            }

            char temp = letters[left];
            letters[left] = letters[right];
            letters[right] = temp;
            left++;
            right--;
        }

        return String.valueOf(letters);
    }

    private boolean isNotVowel(char c) {
        for (char vowel : VOWELS) {
            if (c == vowel) {
                return false;
            }
        }

        return true;
    }
}
