package com.sparta.h2test;

import java.util.Arrays;
public class StringSortRandom {

    public static String[] solution(String[] strings, int n) {
        String[] sub_strings = new String[strings.length];
        String[] answer = new String[strings.length];
        Arrays.sort(strings);
        for (int i = 0; i < strings.length;i++) {
            sub_strings[i] = strings[i].charAt(n)+strings[i]+i;
        }
        Arrays.sort(sub_strings);
        int j =0;
        for (String a : sub_strings) {
            int index = make_index(a);
            answer[j]=strings[index];
            j++;
        }
        return answer;
    }

    private static int make_index(String a) {
        int index=0;
        for (int i=0; i < a.length();i++) {
            if (a.charAt(i)>=48 && a.charAt(i)<=57) {
                index = index*10 + (a.charAt(i)-48);
            }
        }
        return index;
    }
}
