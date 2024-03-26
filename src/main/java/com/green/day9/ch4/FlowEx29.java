package com.green.day9.ch4;

public class FlowEx29 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            System.out.print(i);
            System.out.print("");
            if (i % 10 == 3 || i % 10 == 6 || i % 10 == 9) {
                System.out.print("짝");
            }
            if (i / 10 == 3 || i / 10 == 6 || i / 10 == 9) {
                System.out.print("짝");
            }
            System.out.println("");
        }
    }
}

