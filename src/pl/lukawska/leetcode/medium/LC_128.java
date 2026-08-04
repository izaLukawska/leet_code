package pl.lukawska.leetcode.medium;

import java.util.HashSet;
import java.util.Set;

public class LC_128 {
    public int longestConsecutive(int[] nums) {
        if (nums.length < 1) {
            return 0;
        }

        Set<Integer> numbers = new HashSet<>();

        for (int num : nums) {
            numbers.add(num);
        }

        int maxLen = 1;

        for (int num : numbers) {
            if (!numbers.contains(num - 1)) {
                int nextNumber = num + 1;
                int currLen = 1;

                while (numbers.contains(nextNumber)) {
                    nextNumber++;
                    currLen++;
                }

                maxLen = Math.max(maxLen, currLen);
            }
        }

        return maxLen;
    }
}
