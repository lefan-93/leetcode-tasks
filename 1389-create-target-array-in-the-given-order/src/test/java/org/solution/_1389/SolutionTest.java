package org.solution._1389;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void example1Test() {
        Solution solution = new Solution();
        int[] nums = {0, 1, 2, 3, 4};
        int[] index = {0, 1, 2, 2, 1};
        int[] output = {0, 4, 1, 3, 2};
        int[] answer = solution.createTargetArray(nums, index);
        assertArrayEquals(output, answer);
    }

    @Test
    void example2Test() {
        Solution solution = new Solution();
        int[] nums = {1, 2, 3, 4, 0};
        int[] index = {0, 1, 2, 3, 0};
        int[] output = {0, 1, 2, 3, 4};
        int[] answer = solution.createTargetArray(nums, index);
        assertArrayEquals(output, answer);
    }

    @Test
    void example3Test() {
        Solution solution = new Solution();
        int[] nums = {1};
        int[] index = {0};
        int[] output = {1};
        int[] answer = solution.createTargetArray(nums, index);
        assertArrayEquals(output, answer);
    }

}