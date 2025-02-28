package com.example.calculator.Lv1;

import java.util.Scanner;

public class Calculator1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean exitflag = true;

        while (exitflag) {

            System.out.println("원하시는 사칙연산을 골라주세요 + - * /");

            String type = sc.nextLine();

            if (type.equals("+")) {
                System.out.println(" 더하기 ");
                boolean wrongnum = true;

                while (wrongnum) {
                    try {
                        System.out.println("숫자를 입력해주세요");
                        int a = sc.nextInt();
                        System.out.println("숫자를 입력해주세요");
                        int b = sc.nextInt();
                        sc.nextLine();
                        System.out.println(a + b);
                        wrongnum = false;

                    } catch (Exception e) {
                        System.out.println("잘못된 입력입니다. 다시 입력해주세요");
                        sc.nextLine();
                    }
                }

            } else if (type.equals("-")) {
                System.out.println(" 빼기 ");
                boolean wrongnum1 = true;

                while (wrongnum1) {
                    try {
                        System.out.println("숫자를 입력해주세요");
                        int a = sc.nextInt();
                        System.out.println("숫자를 입력해주세요");
                        int b = sc.nextInt();
                        sc.nextLine();
                        System.out.println(a - b);
                        wrongnum1 = false;

                    } catch (Exception e) {
                        System.out.println("잘못된 입력입니다. 다시 입력해주세요");
                        sc.nextLine();
                    }
                }

            } else if (type.equals("*")) {
                System.out.println(" 곱하기 ");
                boolean wrongnum2 = true;

                while (wrongnum2) {
                    try {
                        System.out.println("숫자를 입력해주세요");
                        int a = sc.nextInt();
                        System.out.println("숫자를 입력해주세요");
                        int b = sc.nextInt();
                        sc.nextLine();
                        System.out.println(a * b);
                        wrongnum2 = false;

                    }   catch (Exception e) {
                        System.out.println("잘못된 입력입니다. 다시 입력해주세요");
                        sc.nextLine();
                    }
                }

            } else if (type.equals("/")) {
                System.out.println(" 나누기 ");
                boolean wrongnum3 = true;

                while (wrongnum3) {
                    try {
                        System.out.println("숫자를 입력해주세요");
                        int a = sc.nextInt();
                        System.out.println("숫자를 입력해주세요");
                        int b = sc.nextInt();

                        sc.nextLine();
                        System.out.println(a / b);
                        wrongnum3 = false;
                    }   catch (ArithmeticException e1) {
                        System.out.println("0으로 나눌수 없습니다.");
                    }   catch (Exception e) {
                        System.out.println("잘못된 입력입니다. 다시 입력해주세요");
                        sc.nextLine();
                    }

                }

            } else {

               System.out.println("잘못된 입력값입니다. 다시 입력해주세요.");
               continue;
            }

            System.out.println("Y를 입력하면 계속 진행, EXIT을 입력하면 종료.");
            boolean exitflag1 = true;
            while (exitflag1) {
                String accept = sc.nextLine();

                if (accept.equalsIgnoreCase("Y")) {

                    System.out.println("계속 진행 합니다.");
                    exitflag1 = false;
                } else if (accept.equalsIgnoreCase("EXIT")) {
                    System.out.println("프로그램을 종료합니다.");
                    exitflag = false;
                    break;
                } else {
                    System.out.println("잘못된 입력입니다. Y 또는 EXIT를 입력해주세요.");


                }//if 문 닫음
            } //exit flag while 문 닫음
        }//계산기 while 문 닫음
    }
}

// 두번째 수입력시 잘못된 정보 넣으면 강제종료
// /에서 0을 넣으면 강제종료