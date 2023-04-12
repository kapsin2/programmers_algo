package com.sparta.h2test;

import java.util.HashMap;
import java.util.Optional;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i : tangerine) {
            Optional<Integer> num = map.get(i).describeConstable();
            if (num.isEmpty()) map.put(i,1);
            else map.put(i,map.get(i)+1);
        }
        return answer;
    }
}
