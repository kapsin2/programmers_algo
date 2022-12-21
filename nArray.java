//package com.sparta.h2test;
//
//class Solution {
//    public int[] solution(int n, int[] numlist) {
//        int[] answer = new int[0];
//        int i = 0;
//        for (int j = 0; j < numlist.length;j++) {
//            if(numlist[j] % n == 0){
//                i += 1;
//                answer = new int[i];
//            } else continue;
//        }
//        i=0;
//        for (int j = 0; j < numlist.length;j++) {
//            if(numlist[j] % n == 0){
//                answer[i] = numlist[j];
//                i += 1;
//            } else continue;
//        }
//        return answer;
//    }
//}
