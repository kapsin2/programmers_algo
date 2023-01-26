package com.sparta.h2test;

import java.util.Arrays;
import java.util.List;

public class MaxAndMinValues {
    public  String solution(String s) {
        List<String> Ss = List.of(s.split(" "));
        int[] nums = new int[Ss.size()];
        for(int i = 0; i < Ss.size(); i++){
            nums[i] = Integer.parseInt(Ss.get(i));
        }
        Arrays.sort(nums);

        String answer = nums[0]+" "+nums[Ss.size()-1] ;
        return answer;
    }
}
