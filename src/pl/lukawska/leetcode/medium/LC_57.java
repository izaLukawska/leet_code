package pl.lukawska.leetcode.medium;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/insert-interval/description/
public class LC_57 {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> result = new ArrayList<>();
        int idx = 0;
        int len = intervals.length;

        while (idx < len && intervals[idx][1] < newInterval[0]) {
            result.add(intervals[idx]);
            idx++;
        }

        while (idx < len && intervals[idx][0] <= newInterval[1]) {
            newInterval[0] = Math.min(newInterval[0], intervals[idx][0]);
            newInterval[1] = Math.max(newInterval[1], intervals[idx][1]);
            idx++;
        }

        result.add(newInterval);

        for (int i = idx; i < len; i++) {
            result.add(intervals[i]);
        }

        return result.toArray(int[][]::new);
    }
}
