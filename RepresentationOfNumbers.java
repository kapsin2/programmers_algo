package com.sparta.h2test;
//1~n개의 연속된 숫자로 주어진 n을 표현하는 방법의 갯수리턴
//        1 + 2 + 3 + 4 + 5 = 15
//        4 + 5 + 6 = 15
//        7 + 8 = 15
//        15 = 15                방법:4개
public class RepresentationOfNumbers {
    public int solution(int n) {
        int answer = 1;
        for(int i = 1; i < n ; i++) {
            int sum = 0;
            int j = i;
            while(sum < n) {
                sum += j;
                j += 1;
            }
            if(sum == n) answer += 1;
        }
        return answer;
    }
}
