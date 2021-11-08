package org.solution._2006;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void Example1Test() {
        Solution solution = new Solution();
        int[] nums = {1, 2, 2, 1};
        int k = 1;
        int output = 4;
        int answer = solution.countKDifference(nums, k);
        assertEquals(output, answer);
    }

    @Test
    void Example2Test() {
        Solution solution = new Solution();
        int[] nums = {1, 3};
        int k = 3;
        int output = 0;
        int answer = solution.countKDifference(nums, k);
        assertEquals(output, answer);
    }

    @Test
    void Example3Test() {
        Solution solution = new Solution();
        int[] nums = {3, 2, 1, 5, 4};
        int k = 2;
        int output = 3;
        int answer = solution.countKDifference(nums, k);
        assertEquals(output, answer);
    }

}