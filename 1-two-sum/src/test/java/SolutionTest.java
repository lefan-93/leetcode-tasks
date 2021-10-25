import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;


public class SolutionTest {

    @Test
    void Example1Test() {
        Solution solution = new Solution();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] output = {0, 1};
        int[] answer = solution.twoSum(nums, target);
        assertArrayEquals(output, answer);
    }

    @Test
    void Example2Test() {
        Solution solution = new Solution();
        int[] nums = {3, 2, 4};
        int target = 6;
        int[] output = {1, 2};
        int[] answer = solution.twoSum(nums, target);
        assertArrayEquals(output, answer);
    }

    @Test
    void Example3Test() {
        Solution solution = new Solution();
        int[] nums = {3, 3};
        int target = 6;
        int[] output = {0, 1};
        int[] answer = solution.twoSum(nums, target);
        assertArrayEquals(output, answer);
    }
}
