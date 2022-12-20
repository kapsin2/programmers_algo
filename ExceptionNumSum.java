package com.sparta.h2test;

import java.util.HashMap;

public class ExceptionNumSum {
    public int solution(int[] numbers) {
        int answer = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0 ; i <=9 ; i++) {
            map.put(i,0);
        }
        for (int num : numbers) {
            map.replace(num,1);
        }
        for (int i = 0; i <=9; i++) {
            if(map.get(i) == 0) answer += i;
        }
        return answer;
    }
}
