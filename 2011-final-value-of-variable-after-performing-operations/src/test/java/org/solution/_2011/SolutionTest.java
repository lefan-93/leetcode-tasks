package org.solution._2011;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void Example1Test() {
        Solution solution = new Solution();
        String[] operations = {"--X", "X++", "X++"};
        var output = 1;
        var answer = solution.finalValueAfterOperations(operations);
        assertEquals(output, answer);
    }

    @Test
    void Example2Test() {
        Solution solution = new Solution();
        String[] operations = {"++X", "++X", "X++"};
        var output = 3;
        var answer = solution.finalValueAfterOperations(operations);
        assertEquals(output, answer);
    }

    @Test
    void Example3Test() {
        Solution solution = new Solution();
        String[] operations = {"X++", "++X", "--X", "X--"};
        var output = 0;
        var answer = solution.finalValueAfterOperations(operations);
        assertEquals(output, answer);
    }
}