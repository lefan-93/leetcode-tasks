package org.solution._2006;

public class Solution {
    public int countKDifference(int[] nums, int k) {
        var countPairs = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if (Math.abs(nums[i] - nums[j]) == k)
                    countPairs++;
            }
        }
        return countPairs;
    }
}
