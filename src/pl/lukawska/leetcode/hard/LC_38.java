package pl.lukawska.leetcode.hard;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/count-and-say/description/
public class LC_38 {
    public String countAndSay(int n) {
        String result = "1";

        for (int i = 1; i < n; i++) {
            result = generate(result);
        }

        return result;
    }

    private String generate(String s) {
        List<int[]> pairFreq = pairFreq(s);
        StringBuilder result = new StringBuilder();

        for (int[] pair : pairFreq) {
            result.append(pair[1]);
            result.append(pair[0]);
        }

        return result.toString();
    }

    private List<int[]> pairFreq(String s) {
        List<int[]> result = new ArrayList<>();

        int i = 0;
        while (i < s.length()) {
            int currValue = s.charAt(i) - '0';
            int currFreq = 1;
            while (i + currFreq < s.length() && s.charAt(i + currFreq) - '0' == currValue) {
                currFreq++;
            }
            result.add(new int[]{currValue, currFreq});
            i += currFreq;
        }

        return result;
    }
}
