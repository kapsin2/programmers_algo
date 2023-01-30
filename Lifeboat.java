package com.sparta.h2test;

import java.util.*;

//보트에는 한번에 2명까지 탈수 있다.
//무게제한 이상 탈 수 없다
//최소한의 보트로 사람들을 구할수 있는 경우의 수 계산

public class Lifeboat {
    public int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);
        List<Integer> arr = new ArrayList<>();
        for (int num :people) arr.add(num);

        Deque<Integer> deque = new ArrayDeque<>(arr);
        while(!deque.isEmpty()) {
            if(deque.getFirst()+ deque.getLast()>limit) {
                deque.pollLast();
                answer +=1;
            } else {
                deque.pollLast();
                deque.pollFirst();
                answer += 1;
            }
        }
        return answer;
    }
}
