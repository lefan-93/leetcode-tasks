package org.solution._1313;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void Example1Test() {
        Solution solution = new Solution();
        int[] nums = {1, 2, 3, 4};
        int[] output = {2, 4, 4, 4};
        int[] answer = solution.decompressRLElist(nums);
        assertArrayEquals(output, answer);
    }

    @Test
    void Example2Test() {
        Solution solution = new Solution();
        int[] nums = {1, 1, 2, 3};
        int[] output = {1, 3, 3};
        int[] answer = solution.decompressRLElist(nums);
        assertArrayEquals(output, answer);
    }
}