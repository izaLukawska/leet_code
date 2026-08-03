package pl.lukawska.leetcode.medium;

public class LC_75 {
    public void sortColors(int[] nums) {
        int[] colorCount = new int[3];
        for (int num : nums) {
            colorCount[num]++;
        }

        int idx = 0;

        for (int color = 0; color < 3; color++) {
            while (colorCount[color] > 0) {
                nums[idx] = color;
                idx++;
                colorCount[color]--;
            }
        }
    }
}
