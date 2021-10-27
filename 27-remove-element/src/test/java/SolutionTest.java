import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void Example1Test() {
        Solution solution = new Solution();
        int[] nums = {3, 2, 2, 3};
        int val = 3;
        int output = 2;
        int answer = solution.removeElement(nums, val);
        assertEquals(output, answer);
    }

    @Test
    void Example2Test() {
        Solution solution = new Solution();
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;
        int output = 5;
        int answer = solution.removeElement(nums, val);
        assertEquals(output, answer);
    }
}
