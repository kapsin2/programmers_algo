package com.sparta.h2test;

public class LongJump {
  long answer = 0;
  public long solution(int n) {
    count_way(n,0);
    return answer%1234567;
  }

  private void count_way(int n,int sum) {
    if(sum == n) {
      this.answer += 1;
      return;
    }
    else if(sum > n) return;
    count_way(n,sum+1);
    count_way(n,sum+2);
  }
}
