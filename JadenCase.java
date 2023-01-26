package com.sparta.h2test;


//첫번째가 소문자알파벳이면 바꾼다
//나머지가 대문자면 소문자로 바꾼다.
public class JadenCase {
    public String solution(String s) {
        String answer = "";
        if((int)s.charAt(0)>=97 && (int)s.charAt(0)<=122) {
            answer += String.valueOf(s.charAt(0)).toUpperCase();
        } else {
            answer += String.valueOf(s.charAt(0));
        }
        for(int i=1; i < s.length();i++) {
            if((int)s.charAt(i)>=97 && (int)s.charAt(i)<=122 && (int)s.charAt(i-1) == 32) {         //첫단어가 소문자이면 대문자로 바꿈
                answer += String.valueOf(s.charAt(i)).toUpperCase();
            } else if ((int)s.charAt(i)>=65 && (int)s.charAt(i)<=90 && (int)s.charAt(i-1) == 32) {
                answer += String.valueOf(s.charAt(i));
            } else if ((int)s.charAt(i)>=65 && (int)s.charAt(i)<=90) {
                answer += String.valueOf(s.charAt(i)).toLowerCase();
            } else {
                answer += String.valueOf(s.charAt(i));
            }
        }
        return answer;
    }
}
