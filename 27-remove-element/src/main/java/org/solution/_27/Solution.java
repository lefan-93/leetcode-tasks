package org.solution._27;

public class Solution {
    public int removeElement(int[] nums, int val) {
        int count = 0;
        int deleted = 0;
        for (int i = 0; i < nums.length - deleted; ) {
            if (nums[i] != val) {
                count++;
                i++;
            } else {
                nums[i] = nums[nums.length - deleted - 1];
                deleted++;
            }
        }
        return count;
    }
}
