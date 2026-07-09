package pl.lukawska.leetcode.hard;

//LINK: https://leetcode.com/problems/median-of-two-sorted-arrays/submissions/2061597253/

public class LC_4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] mergedArray = mergeArrays(nums1, nums2);
        int len = mergedArray.length;
        int middle = len / 2;

        return len % 2 != 0 ? mergedArray[middle] : (double) (mergedArray[middle] + mergedArray[middle - 1]) / 2;
    }

    private int[] mergeArrays(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        int[] mergedArray = new int[len1 + len2];

        int currIdx = 0;
        int p1 = 0;
        int p2 = 0;

        while (p1 < len1 && p2 < len2) {
            int value1 = nums1[p1];
            int value2 = nums2[p2];

            if (value1 <= value2) {
                mergedArray[currIdx] = value1;
                p1++;
            } else {
                mergedArray[currIdx] = value2;
                p2++;
            }

            currIdx++;
        }

        while (p2 < len2) {
            mergedArray[currIdx++] = nums2[p2++];
        }

        while (p1 < len1) {
            mergedArray[currIdx++] = nums1[p1++];
        }

        return mergedArray;
    }
}
