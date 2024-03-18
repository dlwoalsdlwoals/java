package com.green.day2;

public class ConditiionalOperater {
    public static void main(String[] args) {
        //삼항식, 조건식 (항이 세개라 삼항식 식 트루 폴스 콜은 물음표 콜론)
        //식 ? true 일때 : false 일때;

        String s = "짝";
        s = "홀";

        s = 10 % 2 == 0 ? "짝" : "홀";

        System.out.println(s);


    }
}
