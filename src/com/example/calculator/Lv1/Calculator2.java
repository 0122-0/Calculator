package com.example.calculator.Lv1;

import java.util.Scanner;


public class Calculator2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean exitflag = true;
        int a = 0;
        int b = 0;
        String type = "";
        char type1 = 0;
        while (exitflag) {
            boolean wrongnum1 = true;

            while (wrongnum1) {

                try {
                    System.out.println("첫 번째 숫자를 입력해주세요");
                    a = sc.nextInt();
                    if(a>=0){
                        sc.nextLine();
                        wrongnum1 = false;
                    } else {
                        System.out.println("양의 정수를 입력해주세요");
                    }
                } catch (Exception e) {
                    System.out.println("잘못된 입력값입니다.");
                    sc.nextLine();

                }
            }

            boolean wrongnum2 = true;

            while (wrongnum2) {

                System.out.println("연산자를 입력해주세요. + - * /");

                type = sc.nextLine();
                if (type.length() == 1) {
                    type1 = type.charAt(0);

                } else {
                    System.out.println("잘못된 입력값입니다.");
                    continue;
                }
                if (type1 == '+' || type1 == '-' || type1 == '*' || type1 == '/') {
                    wrongnum2 = false;
                } else {
                    System.out.println("잘못된 입력값입니다.");
                }
            }
            switch (type1) {
                case '+':
                    System.out.println("더하기");
                    break;
                case '-':
                    System.out.println("빼기");
                    break;
                case '*':
                    System.out.println("곱하기");
                    break;

                case '/':
                    System.out.println("나누기");
                    break;

                default:
                    System.out.println("잘못된 연산자입니다.");
            }

            boolean wrongnum3 = true;

            while (wrongnum3) {
                try {
                    System.out.println("두 번째 숫자를 입력해주세요");
                    b = sc.nextInt();
                    if(b>=0){
                        sc.nextLine();
                        wrongnum3 = false;
                    } else {
                        System.out.println("양의 정수를 입력해주세요");
                    }
                } catch (Exception e) {
                    System.out.println("잘못된 입력값입니다.");
                    sc.nextLine();
                }
            }

            switch (type1) {
                case '+':
                    System.out.println(a + b);
                    break;
                case '-':
                    System.out.println(a - b);
                    break;
                case '*':
                    System.out.println(a * b);
                    break;

                case '/':
                    if (b != 0) {
                        System.out.println(a / b);
                    } else {
                        System.out.println("0으로 나눌 수 없습니다.");
                    }
                    break;

                default:
                    System.out.println("잘못된 연산자입니다.");
            }

            System.out.println("계속하시려면 Y, 끝내시려면 N을 입력해주세요.(Y/N)");

            String accept = sc.nextLine();

            if (accept.equalsIgnoreCase("Y")) {
                System.out.println("계속 진행 됩니다.");

            } else if (accept.equalsIgnoreCase("N")) {
                System.out.println("프로그램을 종료합니다.");
                exitflag = false;

            } else {
                System.out.println("잘못된 입력입니다. Y 또는 N 을 입력해주세요.");
            }
        }
    }
}
