package com.sparta.h2test;

public class Babbling {
    public int solution(String[] babbling) {
        String[] words = {"aya","ye","woo","ma"};
        int answer = 0;
        for(String i : babbling) {
            int a = i.length();
            for(String j : words) {
                if (i.contains(j)) {
                    a = a - j.length();
                }
            }
            if (a == 0) {
                answer += 1;
            }
        }
        return answer;
    }
}
