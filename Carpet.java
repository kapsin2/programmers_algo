package com.sparta.h2test;

//넓이 - 갈색갯수 = 노란색갯수
//(가로 + 세로) * 2 - 4 = 갈색갯수
public class Carpet {
    public int[] solution(int brown, int yellow) {
        int area = brown + yellow;
        int y = 1;
        for (int i = (int) Math.sqrt(area); i > 0;i--) {
            if((brown/2*i)+(2*i)-(i*i) == area) {
                y=i;
                break;
            }
        }
        int x = area/y;
        int[] answer = {x,y};
        return answer;
    }
}
