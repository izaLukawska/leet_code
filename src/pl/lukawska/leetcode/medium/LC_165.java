package pl.lukawska.leetcode.medium;

public class LC_165 {

    public int compareVersion(String version1, String version2) {
        String[] digits1 = version1.split("\\.");
        String[] digits2 = version2.split("\\.");

        int len1 = digits1.length;
        int len2 = digits2.length;

        int idx1 = 0;
        int idx2 = 0;

        while (idx1 < digits1.length && idx2 < digits2.length) {
            int digit1 = Integer.parseInt(digits1[idx1++]);
            int digit2 = Integer.parseInt(digits2[idx2++]);

            if (digit1 < digit2) {
                return -1;
            } else if (digit1 > digit2) {
                return 1;
            }
        }

        for (int i = idx1; i < len1; i++) {
            if (Integer.parseInt(digits1[i]) > 0) {
                return 1;
            }
        }

        for (int i = idx2; i< len2; i++) {
            if (Integer.parseInt(digits2[i]) > 0) {
                return -1;
            }
        }

        return 0;
    }
}
