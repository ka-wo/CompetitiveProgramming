package com.kwolkowski.google.kickstarter.y2021;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ALShapedPlots {
    static class Solution {
        public static void main(String[] args) {
            Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
            int T = in.nextInt();
            for (int i = 1; i <= T; ++i) {
                int R = in.nextInt();
                int C = in.nextInt();
                int[][] matrix = new int[R][C];
                for (int j = 0; j < R; j++) {
                    for (int k = 0; k < C; k++) {
                        matrix[j][k] = in.nextInt();
                    }
                }
                System.out.println("Case #" + i + ": " + solve(matrix));
            }
        }

        private static int solve(int[][] matrix) {
            int[][] right = prepRight(matrix);
            int[][] left = prepLeft(matrix);
            int[][] down = prepDown(matrix);
            int[][] up = prepUp(matrix);

            int count = 0;
            for (int i = 0; i < down.length; i++) {
                for (int j = 0; j < down[0].length; j++) {
                    if(matrix[i][j] == 1) {
                        count += calc(right[i][j]-j, down[i][j]-i);
                        count += calc(right[i][j]-j, i - up[i][j]);
                        count += calc(j - left[i][j], down[i][j]-i);
                        count += calc(j - left[i][j], i - up[i][j]);
                    }
                }
            }
            return count;
        }

        private static int calc(int x, int y) {
            if(x == 0 || y == 0) return 0;
            x+=1;
            y+=1;
            int count = 0;
            for (int i = 2; i <= x; i++) {
                if(y >= i*2)
                    count++;
            }
            for (int i = 2; i <= y; i++) {
                if(x >= i*2)
                    count++;
            }
            return count;
        }

        private static int[][] prepRight(int[][] matrix) {
            int[][] res = new int[matrix.length][matrix[0].length];
            for (int i = matrix.length-1; i >= 0; i--) {
                for (int j = matrix[0].length-1; j >= 0 ; j--) {
                    if(matrix[i][j] == 1) {
                        if (j != matrix[0].length - 1)
                            res[i][j] = Math.max(j, res[i][j + 1]);
                        else
                            res[i][j] = j;


                    } else res[i][j] = -1;
                }
            }
            return res;
        }
        private static int[][] prepLeft(int[][] matrix) {
            int[][] res = new int[matrix.length][matrix[0].length];
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[0].length; j++) {
                    if(matrix[i][j] == 1) {
                        if (j != 0 && res[i][j-1] != -1)
                            res[i][j] = Math.min(j, res[i][j - 1]);
                        else
                            res[i][j] = j;
                    } else res[i][j] = -1;
                }
            }
            return res;
        }

        private static int[][] prepDown(int[][] matrix) {
            int[][] res = new int[matrix.length][matrix[0].length];
            for (int i = matrix.length-1; i >= 0; i--) {
                for (int j = matrix[0].length-1; j >= 0 ; j--) {
                   if(matrix[i][j] == 1) {
                       if(i!=matrix.length-1)
                           res[i][j] = Math.max(i, res[i+1][j]);
                       else
                           res[i][j] = i;
                   }else res[i][j] = -1;
                }
            }
            return res;
        }
        private static int[][] prepUp(int[][] matrix) {
            int[][] res = new int[matrix.length][matrix[0].length];
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[0].length; j++) {
                   if(matrix[i][j] == 1) {
                       if(i!=0 && res[i-1][j] != -1)
                           res[i][j] = Math.min(i, res[i-1][j]);
                       else
                           res[i][j] = i;
                   }else res[i][j] = -1;
                }
            }
            return res;
        }
    }
}