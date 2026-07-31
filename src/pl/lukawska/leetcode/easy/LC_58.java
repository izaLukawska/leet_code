package pl.lukawska.leetcode.easy;

//https://leetcode.com/problems/length-of-last-word/
public class LC_58 {
    public int lengthOfLastWord(String s) {
        String[] words = s.trim().split("\\W+");
        return words[words.length - 1].length();
    }
}
