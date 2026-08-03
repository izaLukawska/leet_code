package pl.lukawska.leetcode.medium;

import java.util.Arrays;

//https://leetcode.com/problems/unique-paths/description/
public class LC_62 {
    public int uniquePaths(int m, int n) {
        int[][] grid = new int[m][n];
        initializeGrid(grid);

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                grid[i][j] = grid[i - 1][j] + grid[i][j - 1];
            }
        }

        return grid[m - 1][n - 1];
    }

    private void initializeGrid(int[][] grid) {
        Arrays.fill(grid[0], 1);

        for (int i = 0; i < grid.length; i++) {
            grid[i][0] = 1;
        }
    }
}
