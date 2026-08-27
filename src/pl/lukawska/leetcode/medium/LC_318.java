package pl.lukawska.leetcode.medium;

public class LC_318 {
    public int maxProduct(String[] words) {
        boolean[][] letters = buildLetterMap(words);

        int maxProd = 0;

        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                boolean noCommon = true;

                for (int k = 0; k < 26; k++) {
                    if (letters[i][k] && letters[j][k]) {
                        noCommon = false;
                        break;
                    }
                }

                if (noCommon) {
                    maxProd = Math.max(maxProd, words[i].length() * words[j].length());
                }
            }
        }

        return maxProd;
    }

    private boolean[][] buildLetterMap(String[] words) {
        boolean[][] letters = new boolean[words.length][26];

        for (int i = 0; i < words.length; i++) {
            for (char c : words[i].toCharArray()) {
                letters[i][c - 'a'] = true;
            }
        }

        return letters;
    }
}
