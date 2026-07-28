package pl.lukawska.leetcode.medium;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/spiral-matrix/description/
public class LC_54 {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();

        int[][] directions = {
                {0, 1},
                {1, 0},
                {0, -1},
                {-1, 0}
        };

        int m = matrix.length;
        int n = matrix[0].length;
        boolean[][] visited = new boolean[m][n];

        int row = 0;
        int col = 0;
        int dir = 0;

        for (int i = 0; i < m * n; i++) {
            result.add(matrix[row][col]);
            visited[row][col] = true;

            int newRow = row + directions[dir][0];
            int newCol = col + directions[dir][1];

            if (newRow < 0 || newRow >= m || newCol < 0 || newCol >= n || visited[newRow][newCol]) {
                dir = (dir + 1) % 4;

                newRow = row + directions[dir][0];
                newCol = col + directions[dir][1];
            }

            row = newRow;
            col = newCol;
        }

        return result;
    }
}
