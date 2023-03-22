package com.sparta.h2test;

import java.util.Stack;


class RotateParentheses {
  public int solution(String s) {
    int answer = 0;
    for (int i = 0; i < s.length();i++) {
      s = s.substring(1)+ s.charAt(0);
      if(ck_string(s)) answer +=1;
    }
    return answer;
  }

  private boolean ck_string(String s) {
    Stack<Character> stack = new Stack<Character>();
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      if (c == '(' || c == '{' ||c == '[') stack.push(c);
      else {
        if (stack.isEmpty()) return false;
        char top = stack.pop();
        if((c == ')' && top != '(') || (c == '}' && top != '{') || (c == ']' && top != '[')) return false;

      }
    }
    return stack.isEmpty();
  }
}