package org.solution._1480;

public class Solution {
    public int[] runningSum(int[] nums) {

        int runningSum[] = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            runningSum[i] = runningSum(nums, i);
        }

        return runningSum;
    }

    private int runningSum(int[] nums, int end) {
        int count = 0;

        for (int i = 0; i <= end; i++) {
            count = count + nums[i];
        }

        return count;
    }
}
