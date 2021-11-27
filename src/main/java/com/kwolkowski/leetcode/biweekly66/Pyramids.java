package com.kwolkowski.leetcode.biweekly66;

public class Pyramids {
    public static int countPyramids(int[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if(grid[i][j] == 1) {
                    count += countPyra(grid, i-1, i+1, j);
                }
            }
        }
        return count;
    }

    private static int countPyra(int[][] grid, int fromX, int toX, int j) {
//        //lower
//        int count = 0;
        if(fromX<0 || toX>grid.length-1 || j == 0){}
        else {
            for (int i = fromX; i <= toX; i++) {
                if(grid[i][j-1] != 1) return 0;
            }
            return 1 + countPyra(grid, fromX-1, toX+1, j-1);
//            if(grid[fromX][j-1] == 1 && grid[toX][j-1] == 1){
//                count++;
//                count += countPyra(grid, fromX-1, toX+1, j-1);
//            }
        }
        return 0;
//        //upper
//        if(fromX<0 || toX>grid.length-1 || j == grid[0].length-1){
//            return 0;
//        }
//        else {
//            if(grid[fromX][j+1] == 1 && grid[toX][j+1] == 1){
//                count++;
//                count += countPyra(grid, fromX-1, toX+1, j+1);
//            }
//        }
//        return count;
    }
}
