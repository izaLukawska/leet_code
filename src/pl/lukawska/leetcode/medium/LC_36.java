package pl.lukawska.leetcode.medium;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

//https://leetcode.com/problems/valid-sudoku/description/
public class LC_36 {
    public boolean isValidSudoku(char[][] board) {
        Map<Integer, Set<Character>> rows = new HashMap<>();
        Map<Integer, Set<Character>> cols = new HashMap<>();
        Map<Integer, Set<Character>> boxes = new HashMap<>();

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                char c = board[i][j];

                if (c == '.') {
                    continue;
                }

                int box = (i / 3) * 3 + (j / 3);

                if (!rows.computeIfAbsent(i, k -> new HashSet<>()).add(c) ||
                        !cols.computeIfAbsent(j, k -> new HashSet<>()).add(c) ||
                        !boxes.computeIfAbsent(box, k -> new HashSet<>()).add(c)) {
                    return false;
                }
            }
        }

        return true;
    }
}
