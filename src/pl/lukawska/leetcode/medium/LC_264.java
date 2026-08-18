package pl.lukawska.leetcode.medium;

public class LC_264 {
    public int nthUglyNumber(int n) {
        int[] uglyNumbers = new int[n];
        uglyNumbers[0] = 1;
        int primeFactor2 = 0;
        int primeFactor3 = 0;
        int primeFactor5 = 0;

        for (int i = 1; i < n; i++) {
            int nextPrimeFactor2 = uglyNumbers[primeFactor2] * 2;
            int nextPrimeFactor3 = uglyNumbers[primeFactor3] * 3;
            int nextPrimeFactor5 = uglyNumbers[primeFactor5] * 5;

            int uglyNumber = Math.min(nextPrimeFactor2, Math.min(nextPrimeFactor3, nextPrimeFactor5));
            uglyNumbers[i] = uglyNumber;

            if (uglyNumber == nextPrimeFactor2) {
                primeFactor2++;
            }

            if (uglyNumber == nextPrimeFactor3) {
                primeFactor3++;
            }

            if (uglyNumber == nextPrimeFactor5) {
                primeFactor5++;
            }
        }

        return uglyNumbers[n - 1];
    }
}
