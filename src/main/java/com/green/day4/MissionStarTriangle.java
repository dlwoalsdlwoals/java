package com.green.day4;

public class MissionStarTriangle {
    public static void main(String[] args) {
        //int star = 3~7사이의 랜덤값
        int star = (int)(Math.random() * 5) + 3;
        System.out.println("star="+star);

        for(int z=1; z<=star; z++) {
            for (int i=1; i<=z; i++) {
                System.out.print("*");
            }
            System.out.println();

        /*
        star = 3;
        *
        **
        ***
        star = 5;
        *
        **
        ***
        ****
        *****
         */
        }
    }
}
