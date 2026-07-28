package pl.lukawska.leetcode.medium;

import java.util.*;

//https://leetcode.com/problems/group-anagrams/description/
public class LC_49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagrams = new HashMap<>();

        for (String str : strs) {
            char[] currChars = str.toCharArray();
            Arrays.sort(currChars);
            anagrams.computeIfAbsent(String.valueOf(currChars), s -> new ArrayList<>()).add(str);
        }

        return new ArrayList<>(anagrams.values());
    }
}
