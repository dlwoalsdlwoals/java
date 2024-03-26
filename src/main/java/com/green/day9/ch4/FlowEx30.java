package com.green.day9.ch4;

public class FlowEx30 {
    public static void main(String[] args) {
        int index = 1;
        int sum = 0;
        int i = 0;
        while (true) {
            sum = sum + i;
            if (sum > 100) {
                break;
            }
            i++;
        }
        System.out.println(sum);
        System.out.println(i);
    }
}