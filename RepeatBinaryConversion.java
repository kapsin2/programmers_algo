package com.sparta.h2test;

public class RepeatBinaryConversion {
    public int[] solution(String s) {
        int[] answer = new int[2];
        String temp = s;
        while(!temp.equals("1")){
            answer[1] += temp.replace("1","").length();
            temp = Integer.toBinaryString(temp.replace("0","").length());
            answer[0] +=1;
        }
        return answer;
    }
}
