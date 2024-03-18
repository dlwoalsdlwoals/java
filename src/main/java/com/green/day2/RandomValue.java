package com.green.day2;

public class RandomValue {
    public static void main(String[] args) {
        //형변환, 타입이 안맞으면 맞게 타입 변화를 줘야 한다.
        // 자동형변환, 강제형변환
        System.out.println(Math.random() * 10);

        int result = (int)(Math.random() * 10); // 결과는 0~9 최소0 최대9
        System.out.println(result);

    }
}
