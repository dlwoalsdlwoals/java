package com.green.day11.ch5;

public class ArrayEx12 {
    public static void main(String[] args) {
        String[] names = {"kim", "park", "yi"};
        System.out.println(names[1]);
        String tmp = names[1];
        System.out.println("temp : " + tmp);
        names[0] = "yu";
        System.out.println(names[0]);

        //일반 for문
        for(int i=0; i<names.length; i++) {
            String val = names[i];
            System.out.printf("val : %s\n", val);
        }
        //향상된 for문 for each문
        for(String val : names) {
            System.out.printf("val : %s\n", val);
        }
    }
}
