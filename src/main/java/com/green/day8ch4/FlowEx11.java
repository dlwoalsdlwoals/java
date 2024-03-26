package com.green.day8ch4;

import java.util.Scanner;

public class FlowEx11 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("주민번호를 입력해주세요.\n(format:######-#######)>>");
        String id = scan.nextLine();
        char genderVal = id.charAt(7);
        String result = switch (genderVal) {
            case '1'-> "당신은 2000년 이전에 출생한 남자입니다.";
            case '3' -> "당신은 2000년 이후에 출생한 남자입니다.";
            case '2' -> "당신은 2000년 이전에 출생한 여자입니다";
            case '4' -> "당신은 2000년 이후에 출생한 여자입니다";
            default -> "유효하지 않은 주민번호입니다";
        };
        System.out.println(result);
    }
}
