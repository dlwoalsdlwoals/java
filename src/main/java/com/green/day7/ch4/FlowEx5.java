package com.green.day7.ch4;

import java.util.Scanner;

public class FlowEx5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("점수를 입력해주세요. >>");
        String input = scan.nextLine();
        int num = Integer.parseInt(input);
        System.out.println(num);
        System.out.print("당신의 학점은");

        while(true) {
            String grade = "A";
            String symbol = "+";
            if(num < 0 || num > 100) {
                System.out.println("점수가 잘못되었습니다.");
                break;
            } else if(num < 100) {
                int tenDigit = num / 10; //
                grade = switch (tenDigit) {
                    case 9 -> "A";
                    case 8 -> "B";
                    case 7 -> "C";
                    default -> {
                        symbol = "";
                        yield "C";
                    }
                };

                if(tenDigit > 6) {
                    int oneDigit = num % 10;
                    if(oneDigit < 3) {
                        symbol = "-";
                    } else if(oneDigit < 7) {
                        symbol = "0";
                    }
                }
            }
            System.out.printf("당신의 학점은 %s%s입니다.\n", grade, symbol);
            break;
        }
        System.out.println("-- 종료 --");
    }
}
