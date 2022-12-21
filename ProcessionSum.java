package com.sparta.h2test;

public class ProcessionSum {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int max_x = arr1[0].length;
        int max_y = arr1.length;
        int[][] answer = new int[max_y][max_x];
        for (int y = 0; y < max_y; y++) {
            for (int x = 0; x< max_x; x++) {
                answer[y][x] = arr1[y][x] + arr2[y][x];
            }
        }
        return answer;
    }
}
