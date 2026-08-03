package pl.lukawska.leetcode.medium;

public class LC_74 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rowIdx = findRowContainingTarget(matrix, target);
        if (rowIdx == -1) {
            return false;
        }

        int left = 0;
        int right = matrix[rowIdx].length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (matrix[rowIdx][mid] == target) {
                return true;
            } else if (matrix[rowIdx][mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return false;
    }

    private int findRowContainingTarget(int[][] matrix, int target) {
        int top = 0;
        int bottom = matrix.length - 1;

        while (top <= bottom) {
            int mid = top + (bottom - top) / 2;
            int rowFirst = matrix[mid][0];
            int rowLast = matrix[mid][matrix[mid].length - 1];

            if (target < rowFirst) {
                bottom = mid - 1;
            } else if (target > rowLast) {
                top = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;
    }
}
