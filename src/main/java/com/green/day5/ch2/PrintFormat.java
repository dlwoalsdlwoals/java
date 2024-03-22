package com.green.day5.ch2;

public class PrintFormat {
    public static void main(String[] args) {

        /*
        %d -> 정수 : byte, short, int, long
        %s -> 문자열 : String, "작성한 값"
        %f -> 실수 : float, double
        %b -> 불린 : boolean
        %c -> 문자 : char
         */




        char c = 'A';
        int finger = 10;
        //리터럴 정수는 int타입
        //long타입 리터럴로 변경하려면 끝에 l이나 L을 불이면 됨
        long big = 100_000_000L;
        // '_'는 그냥 천단위 확인용 보기 편하게

        System.out.printf("c=%c, %d\n", c, (int)c);
        //%d 가 정수값 A가 65(컴퓨터가 A를 읽는 숫자)
        System.out.printf("finger=[%5d]\n", finger);
        System.out.printf("finger=[%-5d]\n", finger);
        // -붙이면 왼쪽 정렬
        System.out.printf("finger=[%05d]\n", finger);
        // 0은 빈칸을 0으로 채우겠다
        System.out.println(big);

        //yyyy-mm-dd 이렇게 만들고 싶다
        int year =2024;
        int mon = 3;
        int day = 20;
        System.out.printf("%4d-%02d-%02d\n", year, mon, day);

        String url = "www.green.com";
        float f1 = .10f; // =0.10f,
        //리터럴 실수는 double타입
        // 끝에 f or F를 붙이면 float 타입이 됨

        double d = 1.23456789;

        System.out.printf("url=%s\n", url);
        System.out.printf("f1=%f\n", f1);
        System.out.printf("d=%f\n", d);
        System.out.printf("d=%.2f\n", d); //반올림 처리 됨
        System.out.printf("d=%10.2f\n", d); //반올림 처리 됨


        System.out.printf("[%s]\n", url);
        System.out.printf("[%20s]\n", url);
        System.out.printf("[%-20s]\n", url);
        System.out.printf("[%.8s]\n", url);

    }
}
