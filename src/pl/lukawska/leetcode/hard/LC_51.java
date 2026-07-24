package pl.lukawska.leetcode.hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://leetcode.com/problems/n-queens/description/
public class LC_51 {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();

        char[][] board = new char[n][n];

        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }

        backtrack(board, 0, result);

        return result;
    }

    private void backtrack(char[][] board, int row, List<List<String>> result) {
        if (row == board.length) {
            result.add(buildBoard(board));
            return;
        }

        for (int col = 0; col < board.length; col++) {
            if (!isValid(board, row, col)) {
                continue;
            }

            board[row][col] = 'Q';

            backtrack(board, row + 1, result);

            board[row][col] = '.';
        }
    }

    private boolean isValid(char[][] board, int row, int col) {
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }

    private List<String> buildBoard(char[][] board) {
        List<String> solution = new ArrayList<>();

        for (char[] row : board) {
            solution.add(new String(row));
        }

        return solution;
    }
}
