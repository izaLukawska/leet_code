package pl.lukawska.leetcode.easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LC_349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> result = new HashSet<>();
        Arrays.sort(nums1);

        for (int target : nums2) {
            int left = 0;
            int right = nums1.length - 1;

            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (nums1[mid] == target) {
                    result.add(nums1[mid]);
                    break;
                } else if (nums1[mid] < target) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
