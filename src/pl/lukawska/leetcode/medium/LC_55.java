package pl.lukawska.leetcode.medium;

//https://leetcode.com/problems/jump-game/
public class LC_55 {
    public boolean canJump(int[] nums) {
        int maxReach = 0;

        for (int i = 0; i < nums.length; i++) {
            if (maxReach < i) {
                return false;
            }

            maxReach = Math.max(maxReach, i + nums[i]);
        }

        return true;
    }
}
