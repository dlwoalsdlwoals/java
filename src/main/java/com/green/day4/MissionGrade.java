package com.green.day4;

public class MissionGrade {
    public static void main(String[] args) {
        //int score = 0~100 사이의 랜덤값 나오게 해주세요
        int score = (int)(Math.random()*101);
        if(score >=90) {
            System.out.println("당신의 학점은 A입니다.");
        }else if(score >=80) {
            System.out.println("당신의 학점은 B입니다.");
        }else if(score >=70) {
            System.out.println("당신의 학점은 C입니다.");
        }else {
            System.out.println("당신의 학점은 F입니다.");
        }
        System.out.println("score:" + score);
        System.out.println("-종료-");





    }
}
