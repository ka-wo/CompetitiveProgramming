package com.kwolkowski.leetcode;

import java.util.Arrays;

public class BurstBalloons312 {
    public static int maxCoins(int[] nums) {
        int[] arr = new int[nums.length+2];
        arr[0] = arr[nums.length+1] = 1;
        int n = 1;
        for (int num : nums) arr[n++] = num;

        n++;
        int[][] dp = new int[n][n];
        for (int size = 2; size < n; size++) {
            for (int left = 0; left < n - size; left++) {
                int right = left + size;
                for (int i = left+1; i < right; i++) {
                    dp[left][right] = Math.max(dp[left][right],
                            arr[left] * arr[i] * arr[right]
                            + dp[left][i]
                            + dp[i][right]);
                }
            }
        }
        return dp[0][n-1];
    }
}
