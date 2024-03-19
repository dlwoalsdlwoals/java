package com.green.day4;

public class MissionStarTrianglePractice {
    public static void main(String[] args) {
        int star = (int)(Math.random() * 5) + 3;
        System.out.println("star : "+ star);

        for(int i=1; i<=star; i++) {
            for(int z=1; z<=i; z++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

