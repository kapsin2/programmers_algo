package com.sparta.h2test;

public class SumOfBetweenNum {
    public long solution(int a, int b) {
        if (a == b) return a;
        else if (a>b) return sum1(b,a);
        else return sum1(a,b);
    }

    public long sum1(int a, int b) {
        long sum = 0;
        for (int i = a; i <=b ; i++) {
            sum += i;
        }
        return sum;
    }
}
