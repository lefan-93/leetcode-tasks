package org.solution._13;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    private static final String EXAMPLE_1 = "III";
    private static final String EXAMPLE_2 = "IV";
    private static final String EXAMPLE_3 = "IX";
    private static final String EXAMPLE_4 = "LVIII";
    private static final String EXAMPLE_5 = "MCMXCIV";

    @Test
    void Example1Test() {
        Solution solution = new Solution();
        int output = 3;
        int answer = solution.romanToInt(EXAMPLE_1);
        assertEquals(output, answer);
    }

    @Test
    void Example2Test() {
        Solution solution = new Solution();
        int output = 4;
        int answer = solution.romanToInt(EXAMPLE_2);
        assertEquals(output, answer);
    }

    @Test
    void Example3Test() {
        Solution solution = new Solution();
        int output = 9;
        int answer = solution.romanToInt(EXAMPLE_3);
        assertEquals(output, answer);
    }

    @Test
    void Example4Test() {
        Solution solution = new Solution();
        int output = 58;
        int answer = solution.romanToInt(EXAMPLE_4);
        assertEquals(output, answer);
    }

    @Test
    void Example5Test() {
        Solution solution = new Solution();
        int output = 1994;
        int answer = solution.romanToInt(EXAMPLE_5);
        assertEquals(output, answer);
    }
}
