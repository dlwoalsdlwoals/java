package com.green.day11.ch6;

public class Tv {
    String color;
    boolean power;
    int channel;

    void power() {
        power = !power; //toggle처리
    }
    void channulUp() {
        channel++;
        //channel += 1;
    }
    void channulDown() {
        channel--;
    }
}
