package com.green.day4;

public class MissionABS {
    public static void main(String[] args) {
        int val = (int)(Math.random() * 21) - 10; //0 ~ 20 > -10 ~ 10
        if(val > 0) {
            System.out.println(val);
        }
        else {
            System.out.println(val*-1);
        }

        //방법1
        if(val < 0) {
            val = -val;
        }
        System.out.println("결과값:" + val);

        //방법2
        System.out.println("결과값: ");
        if(val < 0) {
            System.out.println(-val);
        } else {
            System.out.println(val);
        }

        //방법3
        System.out.println("결과값:" + (val <0 ? -val : val));
        //여기의 + 는 문자열 합치는거 사칙연산x
    }
}

