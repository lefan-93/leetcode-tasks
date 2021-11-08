package org.solution._1221;

import java.util.Stack;

public class Solution {
    public int balancedStringSplit(String s) {

        int countR = 0;
        int countL = 0;
        int countSplit = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'R')
                countR++;
            if (s.charAt(i) == 'L')
                countL++;
            if (countR == countL)
                countSplit++;
        }
        return countSplit;
    }
}
