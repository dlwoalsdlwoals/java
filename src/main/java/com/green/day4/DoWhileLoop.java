package com.green.day4;

import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = 0;

        while(true) {
            System.out.print("숫자를 입력해 주세요. (종료:0) >> ");
            input = scan.nextInt();
            if(input == 0) { break;}
            //내가 종료하고 싶은 시점에 이걸 넣음. 보통 분기문에
            //while문 빠져 나옴
        }
        System.out.println("--종료--");
    }
}
