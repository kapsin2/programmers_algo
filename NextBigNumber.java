package com.sparta.h2test;

//        조건 1. n의 다음 큰 숫자는 n보다 큰 자연수 입니다.
//        조건 2. n의 다음 큰 숫자와 n은 2진수로 변환했을 때 1의 갯수가 같습니다.
//        조건 3. n의 다음 큰 숫자는 조건 1, 2를 만족하는 수 중 가장 작은 수 입니다.
public class NextBigNumber {
    public int solution(int n) {
        return mk_nextnum(n);
    }
    private int mk_nextnum(int n) {
        int cnt = Integer.bitCount(n);

            int i = n + 1;
            while (true) {
                if (cnt == Integer.bitCount(i)) {
                    return i;
                }
                i +=1;
            }
    }
}
