package com.green.day8ch4;

import java.util.Scanner;

public class FlowEx25 {
    public static void main(String[] args) {
        System.out.println("숫자를 입력하세요>>");
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        int input = Integer.parseInt(line);
        int sum = 0;
        while (input > 10) {
            int oneDight = input%10;
            sum += input;
            input /= 10;
        }
        sum += input;
        System.out.printf("숫자를 모든 더한 값 : %d\n", sum);
    }
}
