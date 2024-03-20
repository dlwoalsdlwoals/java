package com.green.day5.ch2;

import java.io.PrintStream;

public class Naming {
    public static void main(String[] args) {
        /* 네이밍 규칙
         <변수, 메소드 명명규칙>
         */
        //1.대소문자가 구분, 길이 제한x
        int abc, Abc, aBc, abC;
        int aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa;
        //2.예약어 사용금지 ex) int public; , int void;
        int string; // 가능은 하나 사용x

        //3.숫자로 시작 x ex) int 1abc;/숫자가 첫글자만 아니면 ㄱㅊ
        //4.특수기호는'_', '$'만 허용 ex) int _123, int $123;
        //5.여러 단어로 구성된 이름은 카멜 케이스 기법을 사용한다.
        //  ex) last, index, of >>>>> lastIndexOf
        //      string, buffer >>>>> stringBuffer

        //<클래스 명명규칙>
        //1. 클래스 이름의 첫 글자는 무조건 대문자로 시작 !
        //2. 여러 단어로 구성된 이름은 첫 글자를 모두 대문자로 한다.
        //ex) last, index, of >>>>> LastIndexOf
        //    string, buffer >>>>> StringBuffer

        //<상수 명명규칙>
        //0. 데이터 타입 앞에 final 키워드가 들어간다.
        //1. 상수 이름은 모두 대문자로 한다. 단어 구분은 '_'로 한다.
        //2. 1번 방식으로 이름을 작성하는 건 primitive type일 때 하는 편
        //ex) last, index, of >>> LAST_INDEX_OF
        //    string, buffer  >>> STRING_BUFFER
        final int LAST_INDEX_OF = 10;
        final String NAME = "홍길동";

    }
}
