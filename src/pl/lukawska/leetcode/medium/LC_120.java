package pl.lukawska.leetcode.medium;

import java.util.List;

public class LC_120 {
    public int minimumTotal(List<List<Integer>> triangle) {
        for (int row = triangle.size() - 2; row >= 0; row--) {
            for (int col = 0; col < triangle.get(row).size(); col++) {
                int currVal = triangle.get(row).get(col);
                int leftChild = triangle.get(row + 1).get(col);
                int rightChild = triangle.get(row + 1).get(col + 1);
                triangle.get(row).set(col, currVal + Math.min(leftChild, rightChild));
            }
        }

        return triangle.getFirst().getFirst();
    }
}
