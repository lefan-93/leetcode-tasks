package org.solution._1672;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void Example1Test() {
        Solution solution = new Solution();
        int[][] accounts = {{1, 2, 3}, {3, 2, 1}};
        int output = 6;
        assertEquals(output, solution.maximumWealth(accounts));
    }

    @Test
    void Example2Test() {
        Solution solution = new Solution();
        int[][] accounts = {{1, 5}, {7, 3}, {3, 5}};
        int output = 10;
        assertEquals(output, solution.maximumWealth(accounts));
    }

    @Test
    void Example3Test() {
        Solution solution = new Solution();
        int[][] accounts = {{2, 8, 7}, {7, 1, 3}, {1, 9, 5}};
        int output = 17;
        assertEquals(output, solution.maximumWealth(accounts));
    }
}