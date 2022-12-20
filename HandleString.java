package com.sparta.h2test;

public class HandleString {
    public boolean solution(String s) {
        if(s.length()==4 || s.length()==6) {
            if(s.matches(".*[a-z,A-Z].*")) return false;
        } else {
            return false;
        }
        return true;
    }
}
