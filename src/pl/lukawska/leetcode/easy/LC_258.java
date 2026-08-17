package pl.lukawska.leetcode.easy;

public class LC_258 {
    public int addDigits(int num) {
        int digitSum = digitSum(num);
        while (digitSum > 9){
            digitSum = digitSum(digitSum);
        }

        return digitSum;
    }

    private int digitSum(int num) {
        int sum = 0;
        while (num != 0) {
            int digit = num % 10;
            sum += digit;
            num /= 10;
        }

        return sum;
    }
}
