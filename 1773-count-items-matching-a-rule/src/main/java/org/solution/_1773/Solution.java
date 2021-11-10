package org.solution._1773;

import java.util.List;

public class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        int index = 0;

        switch (ruleKey) {
            case "type": {
                index = 0;
                break;
            }
            case "color": {
                index = 1;
                break;
            }
            case "name": {
                index = 2;
                break;
            }
        }
        for (List<String> item : items) {
            if (item.get(index).equals(ruleValue))
                count = count + 1;
        }
        return count;
    }
}
