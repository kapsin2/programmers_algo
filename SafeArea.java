package com.sparta.h2test;

public class SafeArea {
    public int solution(int[][] board) {
        int answer = 0;
        int n = board.length;
        int[][] board_f= findeMine(board,n);
        for (int i=0; i <  n;i++) {
            for (int j=0; j < n ;j++) {
                if(board_f[i][j]==0) {
                    answer += 1;
                }
            }
        }
        return answer;
    }

    public int[][] findeMine(int[][] board, int n) {
        int[][] board_t = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 1) {
                    board_t = changeArea(board, n,i,j);
                }
            }
        }
        board = board_t;
        return board;
    }

    private int[][] changeArea(int[][] board, int n, int x, int y) {
        for (int i = x-1; i <= x+1 ; i ++) {
            for( int j = y -1; j <= y+1; j++) {
                if((i >= n || j >= n) || (i < 0 || j < 0)) {
                    continue;
                } else if (board[i][j] == 0) {
                    board[i][j] = 2;
                }
            }
        }
        return board;
    }
}
