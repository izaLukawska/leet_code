package pl.lukawska.leetcode.medium;

public class LC_6 {
    public String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }

        StringBuilder[] zigzag = patternStrings(s, numRows);
        return String.join("", zigzag);
    }

    private StringBuilder[] patternStrings(String s, int numRows) {
        StringBuilder[] zigzag = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            zigzag[i] = new StringBuilder();
        }

        int direction = -1;
        int row = 0;

        for (int i = 0; i < s.length(); i++) {
            if (row == 0 || row == numRows - 1) {
                direction *= -1;
            }

            zigzag[row].append(s.charAt(i));
            row = row + direction;
        }

        return zigzag;
    }
}
