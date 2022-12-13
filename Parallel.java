package com.sparta.h2test;

public class Parallel {
    public int solution(int[][] dots) {
        int answer = 0;
        for(int i = 1; i < dots.length;i++) {
            if(isParalleled(dots,0,i)) answer = 1;
        }


        return answer;
    }

    private boolean isParalleled(int[][] dots, int i, int i1) {
        int[] index = {0, 0, 0, 0};
        index[i] = 1;
        index[i1] = 1;
        int i2 = 0;
        int i3 = 0;
        for (int j = 0; j < index.length; j++) {
            if (index[j] == 0) {
                i2 = j;
                index[j] = 1;
                break;
            }
        }
        for (int j = 0; j < index.length; j++) {
            if (index[j] == 0) {
                i3 = j;
                index[j] = 1;
                break;
            }
        }
        double angle_1 = (Math.abs(dots[i][1] - dots[i1][1]) / (double)Math.abs(dots[i][0] - dots[i1][0]));
        double angle_2 = (Math.abs(dots[i2][1] - dots[i3][1]) / (double)Math.abs(dots[i2][0] - dots[i3][0]));
        if (angle_1 == angle_2) return true;
        else return false;
    }
}
