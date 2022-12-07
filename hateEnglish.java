package com.sparta.h2test;

public class hateEnglish {
    public long solution(String numbers) {

        String replace = numbers;
        replace = replace.replace("one","1");
        replace = replace.replace("two","2");
        replace = replace.replace("three","3");
        replace = replace.replace("four","4");
        replace = replace.replace("five","5");
        replace = replace.replace("six","6");
        replace = replace.replace("seven","7");
        replace = replace.replace("eight","8");
        replace = replace.replace("nine","9");
        replace = replace.replace("zero","0");

        long answer = Long.parseLong(replace);
        return answer;
    }
}
