package pl.lukawska.leetcode.medium;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

//LINK: https://leetcode.com/problems/letter-combinations-of-a-phone-number/
public class LC_17 {

    private static final Map<Character, String> DIGIT_TO_LETTERS = Map.of('2', "abc",
                                                                          '3', "def",
                                                                          '4', "ghi",
                                                                          '5', "jkl",
                                                                          '6', "mno",
                                                                          '7', "pqrs",
                                                                          '8', "tuv",
                                                                          '9', "wxyz");

    public List<String> letterCombinations(String digits) {
        String[] letters = convertToLetters(digits);
        List<String> result = new ArrayList<>();

        backtrack(result, letters, new StringBuilder(), 0);

        return result;
    }

    private void backtrack(List<String> result, String[] letters, StringBuilder combination, int groupIdx){
        if(groupIdx == letters.length){
            result.add(combination.toString());
            return;
        }

        String currGroup = letters[groupIdx];
        for(int i = 0; i < currGroup.length(); i++){
            combination.append(currGroup.charAt(i));

            backtrack(result, letters, combination, groupIdx + 1);

            combination.deleteCharAt(combination.length() - 1);
        }
    }

    private String[] convertToLetters(String digits) {
        String[] result = new String[digits.length()];

        for (int i = 0; i < result.length; i++) {
            result[i] = DIGIT_TO_LETTERS.get(digits.charAt(i));
        }

        return result;
    }
}
