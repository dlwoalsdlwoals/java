package com.green.day7.ch4;

import java.util.Scanner;

public class FlowEx6 {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("월을 입력해주세요. >>");
        int num = scan.nextInt();
        System.out.print("현재의 계절은 ");

        switch((int) num) {
            case 3:
            case 4:
            case 5:
                System.out.println("봄입니다");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("여름입니다");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("가을입니다");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println("겨울입니다");
                break;
            default:
                System.out.println("잘못입력하셨습니다.");
        }

    }
}
