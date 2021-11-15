package com.kwolkowski.leetcode;

import java.util.LinkedList;
import java.util.List;

public class WordSearch79 {

    public static boolean exist(char[][] board, String word) {

        char[] chars = word.toCharArray();
        List<int[]> startingPoints = new LinkedList<>();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == chars[0]) {
                    startingPoints.add(new int[]{i, j});
                }
            }
        }

        boolean res = false;
        for (int[] pos : startingPoints) {
            res = res || dfs(pos, 0, board, chars, new LinkedList<>());
        }
        return res;
    }

    private static boolean dfs(int[] pos, int index, char[][] board,
                               char[] chars, LinkedList<String> visited) {
        if (index == chars.length)
            return true;
        if (pos[0] < 0 || pos[1] < 0 || pos[0] >= board.length || pos[1] >= board[0].length)
            return false;
        String key = pos[0] + "," + pos[1];
        if (visited.contains(key))
            return false;
        boolean res = false;
        visited.add(key);
        if (board[pos[0]][pos[1]] == chars[index]) {
            res = dfs(new int[]{pos[0] + 1, pos[1]}, index + 1, board, chars, visited)
                    || dfs(new int[]{pos[0] - 1, pos[1]}, index + 1, board, chars, visited)
                    || dfs(new int[]{pos[0], pos[1] + 1}, index + 1, board, chars, visited)
                    || dfs(new int[]{pos[0], pos[1] - 1}, index + 1, board, chars, visited);
        }
        visited.remove(key);
        return res;
    }

}
