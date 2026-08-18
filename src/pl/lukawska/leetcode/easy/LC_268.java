package pl.lukawska.leetcode.easy;

public class LC_268 {
    public int missingNumber(int[] nums) {
        int len = nums.length;
        int missingValue = len * (len + 1) / 2;

        for(int num : nums){
            missingValue -= num;
        }

        return missingValue;
    }
}
