package org.solution._2037;

import java.util.Arrays;

public class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        var moving = 0;
        Arrays.sort(seats);
        Arrays.sort(students);

        for (int i = 0; i < seats.length; i++) {
            moving = moving + Math.abs(seats[i] - students[i]);
        }
        return moving;
    }
}
