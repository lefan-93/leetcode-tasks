package org.solution._1313;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int[] decompressRLElist(int[] nums) {

        List<Integer> result = new ArrayList();

        for (int i = 0; i < nums.length - 1; i += 2) {
            for (int j = 0; j < nums[i]; j++) {
                result.add(nums[i + 1]);
            }
        }

        return result.stream().mapToInt(i -> i).toArray();
    }
}
