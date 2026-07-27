package pl.lukawska.leetcode.medium;

//https://leetcode.com/problems/jump-game-ii/
public class LC_45 {
    public int jump(int[] nums) {
        int minJumps = 0;
        int maxReach = 0;
        int currEnd = 0;

        for(int i = 0; i < nums.length - 1; i++){
            maxReach = Math.max(maxReach, i + nums[i]);

            if(i == currEnd){
                currEnd = maxReach;
                minJumps++;

            }
        }

        return minJumps;
    }
}
