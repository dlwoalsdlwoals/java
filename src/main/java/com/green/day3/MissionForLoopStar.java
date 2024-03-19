package com.green.day3;

public class MissionForLoopStar {
    public static void main(String[] args) {
        //int star = 3~10 랜덤한 값이 star 변수에 대입되도록 해주세요.
        //           0~7
        int star = (int)(Math.random() * 8) + 3;
        System.out.println(star);

        for(int i=star; i>0; i--) {
            System.out.print("*");

        //for (int i=0; i<star; i++) {
        //    System.out.print("*");
        }
    }
}

//for(초기화 ; 조건식 ; 증감식 ) {반복하고 싶은코드}
//      0       1       3            2