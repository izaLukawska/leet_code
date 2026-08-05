package pl.lukawska.leetcode.medium;

import java.util.Arrays;
import java.util.stream.Collectors;

public class LC_179 {
    public String largestNumber(int[] nums) {
        String result = Arrays.stream(nums)
                              .mapToObj(String::valueOf)
                              .sorted((a, b) -> (b + a).compareTo(a + b))
                              .collect(Collectors.joining());

        return result.charAt(0) == '0' ? "0" : result;
    }
}
