package pl.lukawska.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class LC_228 {
    public static void main(String[] args) {
        System.out.println(summaryRanges(new int[]{0, 1, 2, 4, 5, 7}));
        System.out.println(summaryRanges(new int[]{0, 2, 3, 4, 6, 8, 9}));
    }

    public static List<String> summaryRanges(int[] nums) {
        List<String> ranges = new ArrayList<>();

        if (nums.length < 1) {
            return ranges;
        }

        int left = 0;
        int right = left + 1;

        while (right < nums.length) {
            if (nums[right] - nums[right - 1] != 1) {
                String range = nums[left] == nums[right - 1] ?
                        String.valueOf(nums[left]) : nums[left] + "->" + nums[right - 1];
                ranges.add(range);
                left = right;
            }

            right++;
        }

        String range = nums[left] == nums[right - 1] ? String.valueOf(nums[left]) : nums[left] + "->" + nums[right - 1];
        ranges.add(range);

        return ranges;
    }
}
