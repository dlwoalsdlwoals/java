package com.green.day6.ch3;

public class OperatorEx23 {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = new String("abc");
        //new로 이렇게 하면 abc는 같은데 다른거임

        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);
        System.out.println("str1 == str2:" + (str1 == str2));
        //문자열 비교는 ==이 아니라 .equals() 로
        //System.out.println("str1.equals(str2):" + str1.equals(str2)

        //동등성 -> 지위, 권리, 권한 같은거
        //동일성 -> 같은 인물, 같은지
    }
}
