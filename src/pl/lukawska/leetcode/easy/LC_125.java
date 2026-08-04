package pl.lukawska.leetcode.easy;

public class LC_125 {
    public boolean isPalindrome(String s) {
        String normalizedString = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int left = 0;
        int right = normalizedString.length() - 1;
        while (left < right) {
            if (normalizedString.charAt(left) != normalizedString.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
