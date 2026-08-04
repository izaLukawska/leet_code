package pl.lukawska.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class LC_118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascalsTriangle = new ArrayList<>();
        pascalsTriangle.add(List.of(1));

        for (int i = 1; i < numRows; i++) {
            List<Integer> currRow = new ArrayList<>();
            currRow.add(1);

            List<Integer> prevRow = pascalsTriangle.get(i - 1);
            for (int j = 1; j < prevRow.size(); j++) {
                currRow.add(prevRow.get(j - 1) + prevRow.get(j));
            }

            currRow.add(1);
            pascalsTriangle.add(currRow);
        }

        return pascalsTriangle;
    }
}
