package com.green.day8ch4;

public class FlowEx18 {
    public static void main(String[] args) {
        for (int i = 2; i <= 9; i++) {
            if(i>2) {
                System.out.println("------");
            }
            for (int n = 1; n <= 9; n++)
                System.out.printf("%d x %d = %d%n", i, n, i * n);
        }
    }
}