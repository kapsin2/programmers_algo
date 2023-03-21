package com.sparta.h2test;

public class PredictedBrackets {
  public int solution(int n, int a, int b)
  {
    int cnt = 1;
    while (n >1) {

      if (a % 2 == 0 && b == a - 1) return cnt;
      else if (a % 2 == 1 && b == a + 1) return cnt;

      n = n / 2;
      if (a % 2 == 0) a = a/2;
      else if (a % 2 == 1) a = a/2 + 1;
      if (b % 2 == 0) b = b/2;
      else if (b % 2 == 1) b = b/2 + 1;

      cnt += 1;
    }
    return cnt;
  }
}
