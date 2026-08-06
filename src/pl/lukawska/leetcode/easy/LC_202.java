package pl.lukawska.leetcode.easy;

import java.util.HashSet;
import java.util.Set;

public class LC_202 {
    public boolean isHappy(int n) {
        Set<Integer> seenSquareSum = new HashSet<>();

        while (n != 1) {
            n = digitSquareSum(n);
            if (seenSquareSum.contains(n)) {
                return false;
            } else {
                seenSquareSum.add(n);
            }
        }

        return true;
    }

    private int digitSquareSum(int n) {
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }

        return sum;
    }
}
