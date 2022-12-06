package com.sparta.h2test;

class Solution {
    public int[][] solution(int[] num_list, int n) {
        int a = num_list.length/n;
        int i2 = 0;
        int[][] answer = new int[a][n];
        for (int i = 0; i<a;i++){
            for(int j = 0; j<n;j++) {
                answer[i][j] = num_list[i2];
                i2 +=1;
            }
        }
        return answer;
    }
}