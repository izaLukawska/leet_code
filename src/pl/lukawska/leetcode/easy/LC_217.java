package pl.lukawska.leetcode.easy;

import java.util.HashSet;
import java.util.Set;

public class LC_217 {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();

        for (int num : nums) {
            if (seen.contains(num)) {
                return true;
            } else {
                seen.add(num);
            }
        }

        return false;
    }
}
