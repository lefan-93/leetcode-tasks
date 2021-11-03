package org.solution._1672;

public class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        for (int i = 0; i < accounts.length; i++) {
            int accountBalance = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                accountBalance += accounts[i][j];
            }
            if (accountBalance > max) {
                max = accountBalance;
            }
        }
        return max;
    }
}
