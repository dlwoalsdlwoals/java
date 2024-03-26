package com.green.day7.ch4;

import com.green.day5.Switch;

import java.util.Scanner;

public class FlowEx10 {
    public static void main(String[] args) {
      int score = 100;
      if(score < 0 || score > 100) {
          System.out.println("잘못된 값입니다.");
      } else {
          int tenDight = score / 10;
          String grade = switch(tenDight) {
              case 9, 10 -> "A";
              case 8 -> "B";
              case 7 -> "C";
              default -> "F";
          };
      }
    }
}
