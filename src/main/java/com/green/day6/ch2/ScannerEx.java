package com.green.day6.ch2;

import java.util.Scanner;

public class ScannerEx {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("두자리 정수를 하나 입력해주세요. >>");
        String input = scan.nextLine(); // 문자 "123" 을 숫자 123으로 바꾸고 싶을 때
        int num = Integer.parseInt(input);
        System.out.println("num: " + num);
        System.out.println("num: + 1:" + (num+1));
    }
}
