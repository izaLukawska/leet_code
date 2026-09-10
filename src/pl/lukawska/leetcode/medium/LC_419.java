package pl.lukawska.leetcode.medium;

public class LC_419 {
    public int countBattleships(char[][] board) {
        int count = 0;

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 'X') {
                    count++;
                    bfs(board, i, j);
                }
            }
        }

        return count;
    }

    private void bfs(char[][] board, int row, int col) {
        if (row < 0 || row > board.length || col < 0 || col > board[0].length || board[row][col] == '.') {
            return;
        }

        board[row][col] = '.';
        int[][] directions = {
                {-1, 0},
                {1, 0},
                {0, -1},
                {0, 1}
        };

        for (int[] direction : directions) {
            int newRow = row + direction[0];
            int newCol = col + direction[1];

            bfs(board, newRow, newCol);
        }
    }
}
