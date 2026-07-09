package pl.lukawska.leetcode.medium;

//LINK: https://leetcode.com/problems/reverse-integer/description/

public class LC_7 {
    public int reverse(int x) {
        int result = 0;
        int prev = 0;
        while(x != 0){
            int lastDigit = x % 10;
            x = x / 10;
            result = result * 10 + lastDigit;
            if((result - lastDigit) / 10 != prev){
                return 0;
            }
            prev = result;
        }
        return result;
    }
}
