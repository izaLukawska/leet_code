package pl.lukawska.leetcode.easy;

public class LC_415 {
    public static void main(String[] args) {
        System.out.println(addStrings("456", "77")); //533
        System.out.println(addStrings("9", "99")); //108
    }

    public static String addStrings(String num1, String num2) {
        StringBuilder result = new StringBuilder();

        int p1 = num1.length() - 1;
        int p2 = num2.length() - 1;
        int reminder = 0;

        while (p1 >= 0 || p2 >= 0) {
            int val1 = p1 < 0 ? 0 : num1.charAt(p1) - '0';
            int val2 = p2 < 0 ? 0 : num2.charAt(p2) - '0';
            int sum = val1 + val2 + reminder;
            result.append(sum % 10);
            reminder = sum / 10;

            p1--;
            p2--;
        }

        if (reminder > 0) {
            result.append(reminder);
        }

        return result.reverse().toString();
    }
}
