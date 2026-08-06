package pl.lukawska.leetcode.easy;

public class LC_205 {
    public boolean isIsomorphic(String s, String t) {
        int[] sLast = new int[256];
        int[] tLast = new int[256];

        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            if (sLast[c1] != tLast[c2]) {
                return false;
            }

            sLast[c1] = i + 1;
            tLast[c2] = i + 1;
        }

        return true;
    }
}
