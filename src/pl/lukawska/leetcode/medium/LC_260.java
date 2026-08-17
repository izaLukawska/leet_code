package pl.lukawska.leetcode.medium;

import java.util.HashMap;
import java.util.Map;

public class LC_260 {
    public int[] singleNumber(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();

        for (int num : nums) {
            freq.merge(num, 1, Integer::sum);
        }

        int[] result = new int[2];
        int index = 0;

        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            if (entry.getValue() == 1) {
                result[index++] = entry.getKey();
            }
        }

        return result;
    }
}
