package pl.lukawska.leetcode.hard;

public class LC_85 {
    public int maximalRectangle(char[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] dp = new int[m][n];

        int maxArea = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                if (matrix[i][j] == '1') {

                    if (j == 0) {
                        dp[i][j] = 1;
                    } else {
                        dp[i][j] = dp[i][j - 1] + 1;
                    }

                    int width = dp[i][j];

                    for (int k = i; k >= 0; k--) {

                        width = Math.min(width, dp[k][j]);

                        int height = i - k + 1;

                        maxArea = Math.max(maxArea, width * height);
                    }
                }
            }
        }

        return maxArea;
    }
}
