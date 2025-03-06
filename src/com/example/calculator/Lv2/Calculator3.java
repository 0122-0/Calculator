
package com.example.calculator.Lv2;

import java.util.ArrayList;
import java.util.Scanner;

public class Calculator3 {
    public static void main(String[] args) {

        App calculator = new App();
        Scanner sc = new Scanner(System.in);
        boolean restarting = true;
        int a = -1;
        int b = -1;

        while (restarting) {

            a = -1;
            while (a<0) {
                try {
                    System.out.println("첫 번째 숫자를 입력해주세요");
                    a = sc.nextInt();
                    if (a >= 0) {
                    sc.nextLine();

                    } else {
                        System.out.println("양의 정수를 입력해주세요");
                    }
                } catch (Exception e) {
                    System.out.println("잘못된 입력값입니다.");
                    sc.nextLine();
                }
            }

            calculator.operationAdding();

            b = -1;
            while (b<0) {
                try {
                    System.out.println("두 번째 숫자를 입력해주세요");

                    b = sc.nextInt();
                    if (b >= 0) {
                        sc.nextLine();

                    } else {
                        System.out.println("양의 정수를 입력해주세요");
                    }
                } catch (Exception e) {
                    System.out.println("잘못된 입력값입니다.");
                    sc.nextLine();
                }
            }

            calculator.setNum(a,b);
            calculator.getResult();
            if(calculator.restarting()){
                break;
            }

        }
    }
}