package com.example.calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        //스캐너 작동
        Scanner sc = new Scanner(System.in);
//        //첫번째 숫자 입력
//        System.out.println("첫번째 숫자를 입력해주세요.");
//        int a = sc.nextInt();
//        //두번째 숫자 입력
//        System.out.println("두번째 숫자를 입력해주세요.");
//        int b = sc.nextInt();
//        //출력
//        System.out.println("두수의 합은 " + (a + b) + "입니다.");

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(a + b);
    }
}

