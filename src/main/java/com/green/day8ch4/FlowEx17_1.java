package com.green.day8ch4;

import java.util.Scanner;

public class FlowEx17_1 {
    public static void main(String[] args) {
        System.out.println("*을 출력할 라인의 수를 입력하세요>>");
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        int num = Integer.parseInt(line);

        //for문 2개 +
        for(int i=num; i>0; i--) {
            for(int z=1; z<=num; z++) {
                System.out.print(z<i ? "-" : "*");
            }
            System.out.println();
        }
        System.out.println("-------");




        //for문 3개로 해결
        for (int i = 1; i <= num; i++) {
            for (int z = num - i; z > 0; z--) {
                System.out.print("-");
            }
            for (int d = 0; d < i; d++) {
                System.out.print("*");
            }
            System.out.println("");

        }
    }
}
