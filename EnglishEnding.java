package com.sparta.h2test;


import java.util.ArrayList;
import java.util.List;

public class EnglishEnding {

    public int[] solution(int n, String[] words) {
        int[] answer = {0,0};
        int pick = 0;
        List<String> used = new ArrayList<>();
        used.add(words[0]);
        for(int i = 1; i < words.length;i++) {
            if(!(words[i-1].charAt(words[i-1].length()-1) == words[i].charAt(0))){
                pick = i;
                break;
            } else if(used.contains(words[i])) {
                pick = i;
                break;
            } else {
                used.add(words[i]);
            }
        }
        if(pick == 0) {
        }
        else {
            //return answer={words.length/n+1,words.length%n};
            answer[0] = pick%n+1;
            answer[1] = pick/n+1;
        }
        return answer;
    }
}
