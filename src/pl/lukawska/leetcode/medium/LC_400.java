package pl.lukawska.leetcode.medium;

public class LC_400 {
    public int findNthDigit(int n) {
        long target = n;
        long digits = 1;
        long count = 9;
        long current = 1;

        while (target > digits * count){
            target -= digits * count;
            digits++;
            count *= 10;
            current *= 10;
        }

        long number = current + (target - 1) / digits;
        int index = (int) ((target - 1) % digits);

        return String.valueOf(number).charAt(index) - '0';
    }
}
