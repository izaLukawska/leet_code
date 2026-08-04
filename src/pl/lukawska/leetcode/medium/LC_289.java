package pl.lukawska.leetcode.medium;

public class LC_289 {
    public void gameOfLife(int[][] board) {
        int m = board.length;
        int n = board[0].length;
        for (int r = 0; r < m; r++) {
            for (int c = 0; c < n; c++) {
                int liveNeighbors = countNeighbours(board, r, c);

                if (board[r][c] == 1) {
                    if (liveNeighbors < 2 || liveNeighbors > 3) {
                        board[r][c] = -1;
                    }
                } else if (board[r][c] == 0) {
                    if (liveNeighbors == 3) {
                        board[r][c] = 2;
                    }
                }
            }
        }

        for (int r = 0; r < m; r++) {
            for (int c = 0; c < n; c++) {
                if (board[r][c] == -1) {
                    board[r][c] = 0;
                } else if (board[r][c] == 2) {
                    board[r][c] = 1;
                }
            }
        }
    }

    private int countNeighbours(int[][] board, int row, int col) {
        int liveNeighbors = 0;

        for (int dr = -1; dr <= 1; dr++) {
            for (int dc = -1; dc <= 1; dc++) {
                if (dr == 0 && dc == 0) {
                    continue;
                }

                int nr = row + dr;
                int nc = col + dc;

                if (nr >= 0 && nr < board.length && nc >= 0 && nc < board[0].length) {
                    if (Math.abs(board[nr][nc]) == 1) {
                        liveNeighbors++;
                    }
                }
            }
        }

        return liveNeighbors;
    }
}
