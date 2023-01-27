package com.sparta.h2test;


import java.util.Stack;

//임의의 영어소문자 문자열이 주어졌을때 앞뒤로 같은 문자가 있다면 제거하고
//제거한 문자열로 반복해서 제거했을때 문자열이 전부 소거된다면 1을 반환 아니면 0을 반환
public class RemovePairs {
    public static int solution(String s) {
        Stack<Character> stack = new Stack<>();
        int idx = 0;

        if (s.length() == 0) {
            return 0;
        }

        stack.push(s.charAt(idx++));
        while (idx < s.length()) {
            char c = s.charAt(idx++);

            if (!stack.isEmpty() && stack.peek() == c) {
                stack.pop();
            } else {
                stack.push(c);
            }

        }

        return stack.isEmpty() ? 1 : 0;
    }
}
