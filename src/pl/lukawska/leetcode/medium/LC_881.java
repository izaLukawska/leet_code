package pl.lukawska.leetcode.medium;

import java.util.Arrays;

public class LC_881 {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int boatCount = 0;
        int left = 0;
        int right = people.length - 1;

        while (left <= right) {
            int currWeight = people[left] + people[right];

            if (currWeight <= limit) {
                left++;
            }

            right--;
            boatCount++;
        }

        return boatCount;
    }
}
