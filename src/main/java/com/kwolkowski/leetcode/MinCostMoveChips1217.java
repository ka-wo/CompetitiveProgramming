package com.kwolkowski.leetcode;

public class MinCostMoveChips1217 {
    public int minCostToMoveChips(int[] position) {
        int evenCost = 0;
        int oddCost = 0;
        for (int i = 0; i < position.length; i++) {
            if(position[i]%2==0) {
                oddCost++;
            } else {
                evenCost++;
            }
        }
        return Math.min(evenCost, oddCost);
    }
}
