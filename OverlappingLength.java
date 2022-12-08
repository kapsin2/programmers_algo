package com.sparta.h2test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OverlappingLength {
    public int solution(int[][] lines) {
        int answer = 0;
        List<Integer> all = new ArrayList<>();
        for(int i = 0; i < 3; i++) {
            for (int j = 0; j <2; j++){
                all.add(lines[i][j]);
            }
        }
        Collections.sort(all);

        for (int i = all.get(0); i <= all.get(all.size()-1);i++) {
            int cnt = 0;
            if (i >= lines[0][0] && i < lines[0][1]) {
                cnt += 1;
            }
            if (i >= lines[1][0] && i < lines[1][1]) {
                cnt += 1;
            }
            if (i >= lines[2][0] && i < lines[2][1]) {
                cnt += 1;
            }
            if (cnt >= 2) {
                answer +=1;
            }
        }
        return answer;
    }
}
