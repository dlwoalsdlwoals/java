package com.green.day5;

public class MissonGradeV2 {
    public static void maib(String[] args) {
        int score = (int) (Math.random() * 101);
        System.out.println("score : " + score);

        int val1 = score / 10; //0~10
        System.out.println(val1);
        int val2 = score % 10; //0~9
        System.out.println(val2);

        }

    }