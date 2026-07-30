package pl.lukawska.leetcode.medium;

import java.util.Arrays;
import java.util.Comparator;

//https://leetcode.com/problems/merge-intervals/
public class LC_56 {
    public int[][] merge(int[][] intervals) {
        if (intervals.length <= 1) {
            return intervals;
        }

        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));

        int idx = 0;

        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] <= intervals[idx][1]) {
                intervals[idx][1] = Math.max(intervals[idx][1], intervals[i][1]);
            } else {
                idx++;
                intervals[idx] = intervals[i];
            }
        }

        return Arrays.copyOf(intervals, idx + 1);
    }
}
