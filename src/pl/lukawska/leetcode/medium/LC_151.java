package pl.lukawska.leetcode.medium;

public class LC_151 {
    public String reverseWords(String s) {
        String[] words = s.trim().split("\\W++");
        int left = 0;
        int right = words.length - 1;

        while (left < right){
            String temp = words[left];
            words[left] = words[right];
            words[right] = temp;
            left++;
            right--;
        }

        return String.join(" ", words);
    }
}
