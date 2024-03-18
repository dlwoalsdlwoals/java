package com.green.day2;

public class MissionRandomValue {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            int result = (int) (Math.random() * 9) + 1; //0~8
            System.out.println(result);
        }
        System.out.println("-----");

        for(int i=0; i<100; i++) {
            int result = (int)(Math.random() * 8) + 5;
            System.out.println(result);

        }
    }
}
