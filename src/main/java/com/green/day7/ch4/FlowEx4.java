package com.green.day7.ch4;

import java.util.Scanner;

public class FlowEx4 {
    public static void main(String[] args) {
        /*
        Scanner를 통해 점수를 입력받으세요.
        점수는 정수로 바로 받으시고, grade(학점)을 관리할 문자타입을 선언해주세요
        만약 점수가 90 이상이면 grade에 A값을 저장
        80 이상이면 B 70이상이면 C 69이하면 D
        출력은 "당신의 학점은 ? 입니다
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("점수를 입력해주세요. >>");
        String input = scan.nextLine();
        int num = Integer.parseInt(input);
        System.out.println(num);

        if((int) num >= 90) {
            System.out.println("당신의 학점은 A입니다");
        } else if((int) num >= 80) {
            System.out.println("당신의 학점은 B입니다");
        } else if((int) num >= 70) {
            System.out.println("당신의 학점은 C입니다");
        } else {
            System.out.println("당신의 학점은 F입니다");
        }














    }
}
