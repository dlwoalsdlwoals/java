package com.green.day9.ch4;

import java.util.Scanner;

public class FlowEx27 {
    public static void main(String[] args) {
        System.out.println("합계를 숫자를 입력하세요>>");
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        int sum = 0;
        while (input != 0) {
            sum = sum + input;
            if (input != 0) {
                System.out.println("숫자를 입력하세요>>");
                 input = scan.nextInt();
            }
        }
        System.out.print("입력하신 숫자들의 합계는 : " + sum);
    }
}



