package org.solution._1480;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void Example1Test() {
        Solution solution = new Solution();
        int[] nums = {1, 2, 3, 4};
        int[] output = {1, 3, 6, 10};
        int[] answer = solution.runningSum(nums);
        assertArrayEquals(output, answer);
    }

    @Test
    void Example2Test() {
        Solution solution = new Solution();
        int[] nums = {1, 1, 1, 1, 1};
        int[] output = {1, 2, 3, 4, 5};
        int[] answer = solution.runningSum(nums);
        assertArrayEquals(output, answer);
    }

    @Test
    void Example3Test() {
        Solution solution = new Solution();
        int[] nums = {3, 1, 2, 10, 1};
        int[] output = {3, 4, 6, 16, 17};
        int[] answer = solution.runningSum(nums);
        assertArrayEquals(output, answer);
    }
}