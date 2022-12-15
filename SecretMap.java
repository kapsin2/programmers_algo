package com.sparta.h2test;

public class SecretMap {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        int[][] map1 = mk_map(arr1,n);
        int[][] map2 = mk_map(arr2,n);
        String[] answer = sum_map(map1,map2,n);
        return answer;
    }

    private String[] sum_map(int[][] map1, int[][] map2, int n) {
        String[] sumMap = new String[n];
        for(int i = 0; i < n ;i++){
            sumMap[i] = "";
            for(int j = 0; j < n ; j++) {
                if(map1[i][j]==0 && map2[i][j]==0) sumMap[i] += " ";
                else sumMap[i] += "#";
            }
        }
        return sumMap;
    }

    private int[][] mk_map(int[] arr, int n) {
        int[][] map = new int[n][n];
        for (int i =0;i<n;i++) {
            for(int j=n-1;j>=0;j--){
                map[i][j] = arr[i]%2;
                arr[i] = arr[i]/2;
            }
        }
        return map;
    }
}
