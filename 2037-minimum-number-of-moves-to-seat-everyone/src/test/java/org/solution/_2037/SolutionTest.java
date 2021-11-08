package org.solution._2037;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void Example1Test() {
        Solution solution = new Solution();
        int[] seats = {3, 1, 5};
        int[] students = {2, 7, 4};
        var output = 4;
        var answer = solution.minMovesToSeat(seats, students);
        assertEquals(output, answer);
    }

    @Test
    void Example2Test() {
        Solution solution = new Solution();
        int[] seats = {4, 1, 5, 9};
        int[] students = {1, 3, 2, 6};
        var output = 7;
        var answer = solution.minMovesToSeat(seats, students);
        assertEquals(output, answer);
    }

    @Test
    void Example3Test() {
        Solution solution = new Solution();
        int[] seats = {2, 2, 6, 6};
        int[] students = {1, 3, 2, 6};
        var output = 4;
        var answer = solution.minMovesToSeat(seats, students);
        assertEquals(output, answer);
    }
}