package com.sparta.h2test;

import java.util.*;

public class algo_run {
    public static void main(String[] args) {
        int[] ar = {1,2,7,4,5};
        solution(ar,6);
    }

    public static int solution(int[] people, int limit) {
        int answer = 1;
        Arrays.sort(people);
        List<Integer> arr = new ArrayList<>();
        for (int num :people) arr.add(num);

        Deque<Integer> deque = new ArrayDeque<>(arr);
        System.out.println(deque);
        return answer;
    }
}
