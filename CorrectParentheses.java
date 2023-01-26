package com.sparta.h2test;

public class CorrectParentheses {
    boolean solution(String s) {
        int a = 0;
        for(int i = 0; i< s.length();i++) {
            if((int)s.charAt(i) == 40) a += 1;
            else if ((int)s.charAt(i) == 41) a -= 1;

            if(a<0) return false;
        }
        if(a == 0) return true;
        else return false;
    }
}
