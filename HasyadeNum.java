package com.sparta.h2test;

import java.util.ArrayList;
import java.util.List;

public class HasyadeNum {
    public boolean solution(int x) {
        boolean answer = false;
        int y =x;
        int sum = 0;
        List<Integer> numbers = new ArrayList<>();
        while(x > 0) {
            numbers.add(x % 10);
            x = x /10;
        }
        for (int num : numbers) {
            sum += num;
        }
        if (y % sum == 0) {
            answer = true;
        }
        return answer;
    }
}
