package pl.lukawska.leetcode.easy;

public class LC_88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int endIdx1 = m - 1;
        int endIdx2 = n - 1;
        int end = m + n - 1;

        while (endIdx1 >= 0 && endIdx2 >= 0) {
            if (nums1[endIdx1] < nums2[endIdx2]) {
                nums1[end] = nums2[endIdx2--];
            } else {
                nums1[end] = nums1[endIdx1--];
            }

            end--;
        }

        while (endIdx2 >= 0) {
            nums1[end--] = nums2[endIdx2--];
        }
    }
}
