package com.green.day4;

public class MissionSumEvenForLoop {
    public static void main(String[] args) {
        //1~100까지 짝수만 더한 값 출력

            int sum = 0;
            for (int i = 1; i <= 100; i++) {
                if(i % 2 ==0) {
                    sum = sum + i;
                }
            }
            System.out.println("Sum : " + sum);
        }
    }

