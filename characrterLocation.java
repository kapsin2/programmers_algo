package com.sparta.h2test;
                                                        /
public class characrterLocation {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2];                         //[0,0]으로 초기화한다.
        int x = (board[0]-1)/2;
        int y = (board[1]-1)/2;;
        for (String key: keyinput) {                      //keyinput에 따라 좌표를 바꿔준다
          if (key.equals("right") && answer[0] != x) {
              answer[0] += 1;
          } else if (key.equals("left") && answer[0] != -x) {
              answer[0] -= 1;
          } else if (key.equals("up") && answer[1] != y) {
              answer[1] += 1;
          } else if (key.equals("down") && answer[1] != -y) {
              answer[1] -= 1;
          }
        }
        return answer;
    }
}
