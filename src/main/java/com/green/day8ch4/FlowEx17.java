package com.green.day8ch4;

import java.util.Scanner;

public class FlowEx17 {
    public static void main(String[] args){
        System.out.println("*을 출력할 라인의 수를 입력하세요>>");
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        int num = Integer.parseInt(line);

        for(int i=1; i<=num; i++) {
            for(int z=1; z<=i; z++)
                System.out.print("*");
            System.out.println("");
        };
    }
}
