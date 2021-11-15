package com.kwolkowski.leetcode.competition;

public class Robot5911 {
}

class Robot {

    int dir; // 0 - NORTH, 1 EAST, 2 SOUTH, 3 WEST
    int[][] map;
    int x;
    int y;
    boolean willTurn = false;
    int steps = 0;

    public Robot(int width, int height) {
        dir = 1;
        map = new int[width][height];
        x = 0;
        y = 0;
    }

    public void move(int num) {
        steps += num;
    }

    public void move2(int num) {
//        System.out.println(2 * map.length  + 2 * map[0].length);
        if(num > (2 * (map.length-1)  + 2 * (map[0].length-1))) {
            num %= (2 * (map.length - 1) + 2 * (map[0].length - 1));
            num += (2 * (map.length - 1) + 2 * (map[0].length - 1));
        }
//        num += (2 * (map.length-1)  + 2 * (map[0].length-1));
//        num += (2 * (map.length-1)  + 2 * map[0].length);
        while(num > 0) {
            if(willTurn) {
                dir = (dir-1+4)%4;
                willTurn = false;
            }
            if(dir == 0) {
                if(num >= map[0].length-1-y){
                    num -= map[0].length-1-y;
                    y = map[0].length-1;
                    willTurn = true;
                } else {
                    y += num;
                    num = 0;
                }
//                y++;
//                if(y == map[0].length-1) willTurn = true;
            }
            else if(dir == 1) {
                if(num >= map.length-1-x){
                    num -= map.length-1-x;
                    x = map.length-1;
                    willTurn = true;
                } else {
                    x += num;
                    num = 0;
                }
//                x++;
//                if(x == map.length-1) willTurn = true;
            }
            else if(dir == 2) {
                if(num >= y){
                    num -= y;
                    y = 0;
                    willTurn = true;
                } else {
                    y -= num;
                    num = 0;
                }
//                y--;
//                if(y == 0) willTurn = true;
            }
            else if(dir == 3) {
                if(num >= x){
                    num -= x;
                    x = 0;
                    willTurn = true;
                } else {
                    x -= num;
                    num = 0;
                }
//                x--;
//                if(x == 0) willTurn = true;
            }
        }
    }

    public int[] getPos() {
        move2(steps);
        steps = 0;
        return new int[]{x, y};
    }

    public String getDir() {
        move2(steps);
        steps = 0;
        if(dir == 0) return "North";
        if(dir == 1) return "East";
        if(dir == 2) return "South";
        return "West";
    }
}