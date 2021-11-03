package org.solution._35;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void Example1Test() {
        Solution solution = new Solution();
        int[] nums = {1, 3, 5, 6};
        int target = 5;
        int output = 2;
        int answer = solution.searchInsert(nums, target);
        assertEquals(output, answer);
    }

    @Test
    void Example2Test() {
        Solution solution = new Solution();
        int[] nums = {1, 3, 5, 6};
        int target = 2;
        int output = 1;
        int answer = solution.searchInsert(nums, target);
        assertEquals(output, answer);
    }

    @Test
    void Example3Test() {
        Solution solution = new Solution();
        int[] nums = {1, 3, 5, 6};
        int target = 7;
        int output = 4;
        int answer = solution.searchInsert(nums, target);
        assertEquals(output, answer);
    }

    @Test
    void Example4Test() {
        Solution solution = new Solution();
        int[] nums = {1, 3, 5, 6};
        int target = 0;
        int output = 0;
        int answer = solution.searchInsert(nums, target);
        assertEquals(output, answer);
    }

    @Test
    void Example5Test() {
        Solution solution = new Solution();
        int[] nums = {1};
        int target = 0;
        int output = 0;
        int answer = solution.searchInsert(nums, target);
        assertEquals(output, answer);
    }

}