package com.green.day7.ch4;

import java.util.Scanner;

public class FlowEx8 {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("주민번호를 입력해주세요.\n(format:######-#######)>>");
        String id = scan.nextLine();
        char genderVal = id.charAt(7);
        String result = switch (genderVal) {
            case '1', '3' -> "당신은 남자입니다";
            case '2', '4' -> "당신은 여자입니다";
            default -> "유효하지 않은 주민번호입니다";
        };
        System.out.println(result);
    }

}
