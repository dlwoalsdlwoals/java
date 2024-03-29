package com.green.day12;

public class Variable {
    int iv; //인스턴스 변수, 전역 변수
    static  int cv; //클래스 변수, 스태틱 변수

    void method() {
        int lv = 0; //지역 변수
    }

    static void staticMethod() {
        int lv = 0; //지역 변수
    }
}
