package com.sparta.h2test;

import java.util.Arrays;

public class HIndex {
  public int solution(int[] citations) {
    int answer = 0;
    Arrays.sort(citations);
    for(int i = citations.length;i>=0;i--) {
      for (int idx = 0; idx < citations.length; idx++) {
        int a = citations[idx];
        if (a >= i && i == citations.length-idx) {
          return i;
        }
      }
    }
    return answer;
  }
}
