package pl.lukawska.leetcode.medium;

//LINK: https://leetcode.com/problems/longest-palindromic-substring/

public class LC_5 {
    public String longestPalindrome(String s) {
        if (s.length() < 2) {
            return s;
        }

        String result = "";

        for (int i = 1; i < s.length(); i++) {
            String oddLen = findPalindrome(s, i, i);
            String evenLen = findPalindrome(s, i, i - 1);

            if (oddLen.length() > result.length()) {
                result = oddLen;
            }

            if (evenLen.length() > result.length()) {
                result = evenLen;
            }
        }

        return result;
    }

    private String findPalindrome(String s, int left, int right) {
        String result = "";

        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;


            String current = s.substring(left + 1, right);
            result = current.length() > result.length() ? current : result;
        }

        return result;
    }
}
