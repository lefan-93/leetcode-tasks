package org.solution._1221;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void Example1Test() {
        Solution solution = new Solution();
        String s = "RLRRLLRLRL" ;
        int output = 4;
        int answer = solution.balancedStringSplit(s);
        assertEquals(output, answer);
    }

    @Test
    void Example2Test() {
        Solution solution = new Solution();
        String s = "RLLLLRRRLR" ;
        int output = 3;
        int answer = solution.balancedStringSplit(s);
        assertEquals(output, answer);
    }

    @Test
    void Example3Test() {
        Solution solution = new Solution();
        String s = "LLLLRRRR" ;
        int output = 1;
        int answer = solution.balancedStringSplit(s);
        assertEquals(output, answer);
    }

    @Test
    void Example4Test() {
        Solution solution = new Solution();
        String s = "RLRRRLLRLL" ;
        int output = 2;
        int answer = solution.balancedStringSplit(s);
        assertEquals(output, answer);
    }
}