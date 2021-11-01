package org.solution._2011;

public class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for (String operation : operations) {
            switch (operation) {
                case "--X":
                case "X--": {
                    x = x - 1;
                    break;
                }
                case "X++":
                case "++X": {
                    x = x + 1;
                    break;
                }
                default:
                    break;
            }
        }
        return x;
    }
}
