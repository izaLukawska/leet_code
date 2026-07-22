package pl.lukawska.leetcode.easy;

//LINK: https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/
public class LC_28 {
    public int strStr(String haystack, String needle) {
        int idx = -1;

        for(int i = 0; i < haystack.length() - needle.length() + 1; i++){
            String current = haystack.substring(i, i + needle.length());
            if(current.equals(needle)){
                return i;
            }
        }

        return idx;
    }
}
