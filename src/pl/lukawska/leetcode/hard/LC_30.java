package pl.lukawska.leetcode.hard;

import java.util.ArrayList;
import java.util.List;

//LINK: https://leetcode.com/problems/substring-with-concatenation-of-all-words/description/
public class LC_30 {
    public List<Integer> findSubstring(String s, String[] words) {
        int totalCharCount = words[0].length() * words.length;
        if(totalCharCount > s.length()){
            return new ArrayList<>();
        }

        List<String> combinations = combinations(words);
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i <= s.length() - totalCharCount; i++) {
            String current = s.substring(i, i + totalCharCount);
            if (combinations.contains(current)) {
                result.add(i);
            }
        }

        return result;
    }

    private List<String> combinations(String[] words) {
        List<String> result = new ArrayList<>();
        boolean[] used = new boolean[words.length];
        backtrack(result, words, used, new StringBuilder(), 0);

        return result;
    }

    private void backtrack(List<String> paths, String[] words, boolean[] used, StringBuilder path, int idx) {
        if (idx == words.length) {
            paths.add(path.toString());
            return;
        }

        for (int i = 0; i < words.length; i++) {
            if (used[i]) {
                continue;
            }

            path.append(words[i]);
            used[i] = true;

            backtrack(paths, words, used, path, idx + 1);

            used[i] = false;
            path.delete(path.length() - words[i].length(), path.length());
        }
    }
}
