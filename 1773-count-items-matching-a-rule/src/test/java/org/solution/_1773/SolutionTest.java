package org.solution._1773;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void example1Test() {
        Solution solution = new Solution();
        List<List<String>> items = new ArrayList<>();
        List<String> item1 = Arrays.asList("phone", "blue", "pixel");
        List<String> item2 = Arrays.asList("computer", "silver", "lenovo");
        List<String> item3 = Arrays.asList("phone", "gold", "iphone");
        items.add(item1);
        items.add(item2);
        items.add(item3);
        String ruleKey = "color";
        String ruleValue = "silver";
        int output = 1;
        int answer = solution.countMatches(items, ruleKey, ruleValue);
        assertEquals(output, answer);
    }

    @Test
    void example2Test() {
        Solution solution = new Solution();
        List<List<String>> items = new ArrayList<>();
        List<String> item1 = Arrays.asList("phone", "blue", "pixel");
        List<String> item2 = Arrays.asList("computer", "silver", "phone");
        List<String> item3 = Arrays.asList("phone", "gold", "iphone");
        items.add(item1);
        items.add(item2);
        items.add(item3);
        String ruleKey = "type";
        String ruleValue = "phone";
        int output = 2;
        int answer = solution.countMatches(items, ruleKey, ruleValue);
        assertEquals(output, answer);
    }
}