package org.solution._1909;

public class Solution {

    public boolean canBeIncreasing(int[] nums) {

        if (nums.length <= 2) {
            return true;
        }
        int count = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] <= nums[i - 1]) {
                if (count >= 1) {
                    return false;
                }
                if (i - 1 > 0 && i + 1 < nums.length && nums[i] <= nums[i - 2] && nums[i - 1] >= nums[i + 1]) {
                    return false;
                } else {
                    count++;
                }
            }
        }
        return true;
    }
}
