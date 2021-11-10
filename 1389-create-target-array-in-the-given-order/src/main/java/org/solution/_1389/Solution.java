package org.solution._1389;

public class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {

        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int value = nums[i];
            int ind = index[i];

            if (ind < i) {
                for (int j = i; j > ind; j--) {
                    result[j] = result[j - 1];
                }
            }
            result[ind] = value;
        }
        return result;
    }
}
