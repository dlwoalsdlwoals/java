package com.green.day2;

public class MissionOddEven {
    public static void main(String[] args) {
        //예를들어 num이 만약 5라면
        //콘솔에 출력이 "5는 홀수입니다
        //예를들어 num이 만약 10라면
        //콘솔에 출력이 "10은 짝수입니다
        for (int i = 0; i < 100; i++) {
            int num = (int) (Math.random() * 10) + 1;
            if (num % 2 == 0) {
                System.out.println(num);
                System.out.println("은 짝수입니다");
            }else {
                System.out.println(num);
                System.out.println("은 홀수입니다");
            }
        }
    }
}