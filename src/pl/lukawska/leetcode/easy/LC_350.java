package pl.lukawska.leetcode.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC_350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        List<Integer> result = new ArrayList<>();

        int i = 0;
        int j = 0;

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                result.add(nums1[i]);
                i++;
                j++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
        }

        return result.stream()
                     .mapToInt(Integer::intValue)
                     .toArray();
    }
}
