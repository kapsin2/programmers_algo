package com.sparta.h2test;

import java.util.HashMap;

public class Fibonacci {
    public static HashMap<Integer,Long> save = new HashMap<>();
    public long solution(int n) {
        long answer = mk_fibonacci(n);
        return answer;
    }

    private long mk_fibonacci(int n) {
        if (n == 0) return 0;
        else if (n == 1) return 1;
        else if(save.containsKey(n)) return save.get(n);
        else save.put(n, (mk_fibonacci(n-1)%1234567 + mk_fibonacci(n-2)%1234567));
        return save.get(n)%1234567;
    }
}
