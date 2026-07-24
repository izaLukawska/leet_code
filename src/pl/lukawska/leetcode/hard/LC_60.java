package pl.lukawska.leetcode.hard;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/permutation-sequence/description/
public class LC_60 {
    public String getPermutation(int n, int k) {
        char[] values = new char[n];
        for (int i = 0; i < n; i++) {
            values[i] = (char) ('0' + (i + 1));
        }

        List<Character> charVal = generatePermutations(values, k).getLast();
        StringBuilder result = new StringBuilder();

        for(char c : charVal){
            result.append(c);
        }

        return result.toString();
    }

    private List<List<Character>> generatePermutations(char[] nums, int k) {
        List<List<Character>> result = new ArrayList<>();
        boolean[] used = new boolean[nums.length];

        backtrack(result, new ArrayList<>(), nums, used, k);

        return result;
    }

    private void backtrack(List<List<Character>> result, List<Character> path, char[] nums, boolean[] used, int k) {
        if (result.size() == k) {
            return;
        }

        if (path.size() == nums.length) {
            result.add(new ArrayList<>(path));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (used[i]) {
                continue;
            }

            path.add(nums[i]);
            used[i] = true;

            backtrack(result, path, nums, used, k);

            used[i] = false;
            path.removeLast();
        }
    }
}
