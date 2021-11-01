package org.solution._1929;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void Example1Test() {
        Solution solution = new Solution();
        int[] nums = {1, 2, 1};
        int[] output = {1, 2, 1, 1, 2, 1};
        int[] answer = solution.getConcatenation(nums);
        assertArrayEquals(output, answer);
    }

    @Test
    void Example2Test() {
        Solution solution = new Solution();
        int[] nums = {1, 3, 2, 1};
        int[] output = {1, 3, 2, 1, 1, 3, 2, 1};
        int[] answer = solution.getConcatenation(nums);
        assertArrayEquals(output, answer);
    }
}