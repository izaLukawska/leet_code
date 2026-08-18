package pl.lukawska.leetcode.easy;

public class LC_263 {
    public boolean isUgly(int n) {
        if (n <= 0) {
            return false;
        }

        int[] primeFactors = new int[]{5, 3, 2};
        int idx = 0;
        while (idx < primeFactors.length) {
            if (n % primeFactors[idx] != 0) {
                idx++;
            } else {
                n /= primeFactors[idx];
            }
        }

        return n == 1;
    }
}
