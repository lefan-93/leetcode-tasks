package org.solution._1512;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void Example1Test() {
        Solution solution = new Solution();
        int[] nums = {1, 2, 3, 1, 1, 3};
        int output = 4;
        assertEquals(output, solution.numIdenticalPairs(nums));
    }

    @Test
    void Example2Test() {
        Solution solution = new Solution();
        int[] nums = {1, 1, 1, 1};
        int output = 6;
        assertEquals(output, solution.numIdenticalPairs(nums));
    }

    @Test
    void Example3Test() {
        Solution solution = new Solution();
        int[] nums = {1, 2, 3};
        int output = 0;
        assertEquals(output, solution.numIdenticalPairs(nums));
    }
}