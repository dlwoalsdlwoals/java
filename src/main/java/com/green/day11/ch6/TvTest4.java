package com.green.day11.ch6;

public class TvTest4 {
    public static void main(String[] args) {
        //Q1. Tv 객체의 주소값을 3개 저장할 수 있는 배열을 만들어 주세요.
        Tv[] tvArr = new Tv[3];

        //Q2. 각 방에 tv객체의 주소값을 넣어준다. 모두 동일하지 않다.
        for(int i=0; i < tvArr.length; i++) {
            tvArr[i] = new Tv();
        }

        //Q3. 0번방 tv는 채널11, 1번방 Tv는 채널 12, 2번방 Tv는 채널13
        for(int z=0; z < tvArr.length; z++) {
            tvArr[z].channel = 11+z;
            System.out.println(tvArr[z].channel);
        }

    }
}
