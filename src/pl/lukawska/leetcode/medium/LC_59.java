package pl.lukawska.leetcode.medium;

import java.util.Arrays;

//https://leetcode.com/problems/spiral-matrix-ii/
public class LC_59 {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(generateMatrix(3)));
    }

    public static int[][] generateMatrix(int n) {
        int[][] mat = new int[n][n];

        int[] dr = {0, 1, 0, -1};
        int[] dc = {1, 0, -1, 0};

        int dir = 0;
        int row = 0;
        int col = 0;

        for (int i = 0; i < n * n; i++) {
            mat[row][col] = i + 1;

            int nextRow = row + dr[dir];
            int nextCol = col + dc[dir];

            if (nextRow < 0 || nextRow >= n || nextCol < 0 || nextCol >= n || mat[nextRow][nextCol] != 0) {
                dir = (dir + 1) % 4;

                nextRow = row + dr[dir];
                nextCol = col + dc[dir];
            }

            row = nextRow;
            col = nextCol;
        }

        return mat;
    }
}
