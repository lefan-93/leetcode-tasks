import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    private final static String EXAMPLE_1_INPUT_STRING = "codeleet";
    private final static String EXAMPLE_2_INPUT_STRING = "abc";
    private final static String EXAMPLE_3_INPUT_STRING = "aiohn";
    private final static String EXAMPLE_4_INPUT_STRING = "aaiougrt";
    private final static String EXAMPLE_5_INPUT_STRING = "art";
    private final static int[] EXAMPLE_1_INDICES = {4, 5, 6, 7, 0, 2, 1, 3};
    private final static int[] EXAMPLE_2_INDICES = {0, 1, 2};
    private final static int[] EXAMPLE_3_INDICES = {3, 1, 4, 2, 0};
    private final static int[] EXAMPLE_4_INDICES = {4, 0, 2, 6, 7, 3, 1, 5};
    private final static int[] EXAMPLE_5_INDICES = {1, 0, 2};

    @Test
    void Example1Test() {
        Solution solution = new Solution();
        String output = solution.restoreString(EXAMPLE_1_INPUT_STRING, EXAMPLE_1_INDICES);
        assertEquals("leetcode", output);
    }

    @Test
    void Example2Test() {
        Solution solution = new Solution();
        String output = solution.restoreString(EXAMPLE_2_INPUT_STRING, EXAMPLE_2_INDICES);
        assertEquals("abc", output);
    }

    @Test
    void Example3Test() {
        Solution solution = new Solution();
        String output = solution.restoreString(EXAMPLE_3_INPUT_STRING, EXAMPLE_3_INDICES);
        assertEquals("nihao", output);
    }

    @Test
    void Example4Test() {
        Solution solution = new Solution();
        String output = solution.restoreString(EXAMPLE_4_INPUT_STRING, EXAMPLE_4_INDICES);
        assertEquals("arigatou", output);
    }

    @Test
    void Example5Test() {
        Solution solution = new Solution();
        String output = solution.restoreString(EXAMPLE_5_INPUT_STRING, EXAMPLE_5_INDICES);
        assertEquals("rat", output);
    }
}
