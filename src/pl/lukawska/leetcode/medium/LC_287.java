package pl.lukawska.leetcode.medium;

import java.util.HashSet;
import java.util.Set;

public class LC_287 {
    public int findDuplicate(int[] nums) {
        Set<Integer> numbers = new HashSet<>();

        for (int num : nums) {
            if (!numbers.add(num)) {
                return num;
            }
        }

        return 0;
    }
}
