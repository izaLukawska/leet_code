package pl.lukawska.leetcode.medium;

import java.util.Arrays;

public class LC_324 {
    public void wiggleSort(int[] nums) {
        int n = nums.length;

        int[] sorted = nums.clone();
        Arrays.sort(sorted);

        int mid = (n - 1) / 2;
        int right = n - 1;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                nums[i] = sorted[mid--];
            } else {
                nums[i] = sorted[right--];
            }
        }
    }
}
