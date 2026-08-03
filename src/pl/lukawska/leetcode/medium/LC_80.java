package pl.lukawska.leetcode.medium;

public class LC_80 {
    public int removeDuplicates(int[] nums) {
        int idx = 0;

        for (int num : nums) {
            if (idx < 2 || num != nums[idx - 2]) {
                nums[idx] = num;
                idx++;
            }
        }

        return idx;
    }
}
