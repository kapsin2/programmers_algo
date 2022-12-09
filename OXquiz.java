package com.sparta.h2test;

public class OXquiz {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        for (int i = 0; i < quiz.length; i++) {
            if (ck(quiz[i])) {
                answer[i] = "O";
            } else {
                answer[i] = "X";
            }
        }
        return answer;
    }

    public boolean ck(String str) {
        String[] arr = str.split(" ");
        String b = arr[1];
        int x = Integer.parseInt(arr[0]);
        int y = Integer.parseInt(arr[2]);
        int z = Integer.parseInt(arr[4]);
        switch (b) {
            case "+":
                if (x + y == z) {
                    return true;
                }
                break;
            case "-":
                if (x - y == z) {
                    return true;
                }
                break;

        }
            return false;
    }
}
