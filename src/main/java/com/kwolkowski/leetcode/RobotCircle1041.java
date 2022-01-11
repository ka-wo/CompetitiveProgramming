package com.kwolkowski.leetcode;

public class RobotCircle1041 {
    public static boolean isRobotBounded(String instructions) {
        int[][] directions = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int dir = 0;
        int[] pos = new int[]{0, 0};

        for (int j = 0; j < instructions.length(); j++) {
            if (instructions.charAt(j) == 'G') {
                pos[0] += directions[dir][0];
                pos[1] += directions[dir][1];
            } else if (instructions.charAt(j) == 'L') {
                dir--;
                dir = Math.floorMod(dir, 4);
            } else {
                dir++;
                dir %= 4;
            }
        }
        return pos[0] == 0 && pos[1] == 0 || dir > 0;
    }
}
