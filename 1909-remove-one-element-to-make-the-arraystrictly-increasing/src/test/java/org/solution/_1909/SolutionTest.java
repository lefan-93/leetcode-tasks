package org.solution._1909;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void Example1Test() {
        Solution solution = new Solution();
        int[] nums = {1,2,10,5,7};
        assertTrue(solution.canBeIncreasing(nums));
    }

    @Test
    void Example2Test() {
        Solution solution = new Solution();
        int[] nums = {2,3,1,2};
        assertFalse(solution.canBeIncreasing(nums));
    }

    @Test
    void Example3Test() {
        Solution solution = new Solution();
        int[] nums = {1,1,1};
        assertFalse(solution.canBeIncreasing(nums));
    }

    @Test
    void Example4Test() {
        Solution solution = new Solution();
        int[] nums = {1,2,3};
        assertTrue(solution.canBeIncreasing(nums));
    }
}