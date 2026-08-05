package pl.lukawska.leetcode.medium;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LC_187 {
    public List<String> findRepeatedDnaSequences(String s) {
        int len = s.length();
        if (len < 11) {
            return new ArrayList<>();
        }

        Set<String> seen = new HashSet<>();
        Set<String> result = new HashSet<>();

        for (int i = 0; i < s.length() - 9; i++) {
            String currentSubstring = s.substring(i, i + 10);
            if (seen.contains(currentSubstring)) {
                result.add(currentSubstring);
            } else {
                seen.add(currentSubstring);
            }
        }

        return new ArrayList<>(result);
    }
}
