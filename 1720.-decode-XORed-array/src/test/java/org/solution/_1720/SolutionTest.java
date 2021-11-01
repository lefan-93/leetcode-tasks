package org.solution._1720;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void Example1Test() {
        Solution solution = new Solution();
        int[] nums = {1, 2, 3};
        int first = 1;
        int[] output = {1, 0, 2, 1};
        int[] answer = solution.decode(nums, first);
        assertArrayEquals(output, answer);
    }

    @Test
    void Example2Test() {
        Solution solution = new Solution();
        int[] nums = {6};
        int first = 1;
        int[] output = {1,7};
        int[] answer = solution.decode(nums, first);
        assertArrayEquals(output, answer);
    }
}