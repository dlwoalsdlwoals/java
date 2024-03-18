package com.green.day2;

public class If {
    public static void main(String[] args) {
        int n1 = 10, n2 =20;
        if(n1 > n2) {
            System.out.println("n1은 n2을 초과하는 값입니다.");
        } else {
            System.out.println("n1은 n2 미만의 값입니다.");
        }
        System.out.println("======================");

        n2 = 10;
        if(n1 < n2) {

        } else if(n1 > n2) {
            System.out.println("n1은 n2보다 큽니다.");
        } else if(n1 == n2) {
            System.out.println("n1과 n2은 같다");
        } else {                            // else문이 이렇게 있으면 18~19행은 필요없음
            System.out.println("n1과 n2은 같다");
        }

    }


}