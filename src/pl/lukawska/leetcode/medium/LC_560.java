package pl.lukawska.leetcode.medium;

import java.util.HashMap;
import java.util.Map;

public class LC_560 {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> prefixFreq = new HashMap<>();
        prefixFreq.put(0, 1);

        int prefixSum = 0;
        int count = 0;

        for (int num : nums) {
            prefixSum += num;
            int complement = prefixSum - k;

            if (prefixFreq.containsKey(complement)) {
                count += prefixFreq.get(complement);
            }

            prefixFreq.merge(prefixSum, 1, Integer::sum);
        }

        return count;
    }
}
