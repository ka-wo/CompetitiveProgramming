package com.kwolkowski.leetcode.biweekly66;

import java.util.*;

public class MinimumCostRobot {
    public static int minCost(int[] startPos, int[] homePos, int[] rowCosts, int[] colCosts) {
        int cost = 0;
        if(startPos[0] < homePos[0]) {
            for (int i = startPos[0]+1; i <= homePos[0]; i++) {
                cost += rowCosts[i];
            }
        } else {
            for (int i = startPos[0]-1; i >= homePos[0]; i--) {
                cost += rowCosts[i];
            }
        }

        if(startPos[1] < homePos[1]) {
            for (int i = startPos[1]+1; i <= homePos[1]; i++) {
                cost += colCosts[i];
            }
        } else {
            for (int i = startPos[1]-1; i >= homePos[1]; i--) {
                cost += colCosts[i];
            }
        }
        return cost;
    }
}
