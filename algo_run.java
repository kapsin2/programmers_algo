package com.sparta.h2test;

import java.util.HashMap;

public class algo_run {
    public static void main(String[] args) {
        System.out.println(solution(78));
    }
    public static int solution(int n) {
        return mk_nextnum(n);
    }
    private static int mk_nextnum(int n) {
        int cnt = Integer.toBinaryString(n).replaceAll("0","").length();
        int i = n+1;
        while(true) {
            if ( cnt == Integer.toBinaryString(i).replaceAll("0","").length()) {
                return i;
            }
            i += 1;
        }
    }
}
