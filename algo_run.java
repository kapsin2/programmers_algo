package com.sparta.h2test;

import java.util.HashMap;

public class algo_run {
    public static HashMap<Integer,Long> save = new HashMap<>();
    public static void main(String[] args) {
        System.out.println(solution(51));
    }
    public static long solution(int n) {
        long answer = mk_fibonacci(n) % 1234567;
        return answer;
    }

    private static long mk_fibonacci(int n) {
        if (n == 0) return 0;
        else if (n == 1) return 1;

        if(save.containsKey(n)) return save.get(n);
        save.put(n, (mk_fibonacci(n-1) + mk_fibonacci(n-2)));
        return mk_fibonacci(n-1) + mk_fibonacci(n-2);
    }
}
