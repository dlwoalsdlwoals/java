package com.green.day8ch4;

public class FlowEx16_1 {
    public static void main(String[] args) {
        int star = 5;
        for (int i = 0; i <= star; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.print(" \n");
        }
        for (int x = 0; x <= 5; x++) {
            System.out.println("*");
        }
    }
}