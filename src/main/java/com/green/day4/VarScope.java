package com.green.day4;

public class VarScope {
    public static void main(String[] args) {
        /*
        스코프 개념은 모든 언어가 동일

        변수가 선언되면 그 변수를 감싸는 중괄호가 있다.
        그 중괄호를 벗어나면 죽습니다.
        예시 밑에
         */
        int num = 20;
        if( 1 > 0) {
            //System.out.println(num); //num2는 사용할 수 없다.
            int num2 = 10;
            System.out.println(num);
        }
        System.out.println(num);

        for(int i=0; i<10; i++) {

        }
        for(int i=0; i<10; i++) {

        }
        //for문에 선언된 인덱스는 for문 안에서만 살아있음
        int i=0;
        for(; i<10; i++) {

        }
        System.out.println(i);
    }
}
