package pl.lukawska.leetcode.medium;

public class LC_198 {
    public int rob(int[] nums) {
        int planA = 0;
        int planB = 0;

        for (int rob : nums) {
            int currRob = Math.max(planA + rob, planB);
            planA = planB;
            planB = currRob;
        }

        return Math.max(planA, planB);
    }
}
