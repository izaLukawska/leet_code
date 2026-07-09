package pl.lukawska.leetcode.easy;

public class LC_9 {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        return new StringBuilder(String.valueOf(x)).reverse().toString().equals(String.valueOf(x));
    }
}
