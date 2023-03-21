package com.sparta.h2test;

import java.util.Arrays;

public class MinimumCommonMultiples {
  public int solution(int[] arr) {
    int answer = 0;
    Arrays.sort(arr);
    int a = arr[arr.length-1];
    while(true) {
      if(ck_num(a,arr)) break;
      a = a + arr[arr.length-1];
    }
    answer = a;
    return answer;
  }

  private boolean ck_num(int a, int[] arr) {
    for(int i : arr) {
      if(a % i != 0) return false;
    }
    return true;
  }
}
