package com.green.day9.ch4;

import java.util.Scanner;

public class FlowEx28 {
    public static void main(String[] args) {
        int num = (int) (Math.random() * 100) + 1;
        System.out.println("1 ~ 100의 숫자를 입력하세요>>");
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();

        while (input != num) {
            if (input > num) {
                System.out.println("입력한 숫자보다 정답이 작다.");
                System.out.println("1 ~ 100의 숫자를 입력하세요>>");
                input = scan.nextInt();
            } else if (input < num) {
                System.out.println("입력한 숫자보다 정답이 크다");
                System.out.println("1 ~ 100의 숫자를 입력하세요>>");
                input = scan.nextInt();
            }
        }
        System.out.print("정답");
    }
}
