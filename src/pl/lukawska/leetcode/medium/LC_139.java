package pl.lukawska.leetcode.medium;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LC_139 {
    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> words = new HashSet<>(wordDict);
        boolean[] tracker = new boolean[s.length()+1];
        tracker[0] = true;

        for(int i = 1; i <= s.length(); i++){
            for(int j = 0; j < i; j++){
                if(tracker[j] && words.contains(s.substring(j, i))){
                    tracker[i] = true;
                    break;
                }
            }
        }

        return tracker[s.length()];
    }
}
