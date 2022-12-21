package com.sparta.h2test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DivisibleArray {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {-1};
        int cnt = 0;
        List<Integer> arr1 = new ArrayList<>();
        for(int num: arr){
            if(num % divisor == 0) {
                cnt += 1;
                arr1.add(num);
            }
        }
        if(cnt == 0) return answer;
        answer =new int[cnt];
        for (int i =0 ; i < cnt; i++) {
            answer[i] = arr1.get(i);
        }
        Arrays.sort(answer);
        return answer;
    }
}
