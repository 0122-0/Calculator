package com.example.calculator.Lv2;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    private Scanner sc = new Scanner(System.in);
    private ArrayList<Integer> list = new ArrayList<>();
    private int a;
    private int b;
    private String type;
    private char type1;
    private boolean restarting = true;
    private boolean exitflag = true;


    void setNum(int a, int b){
        this.a=a;
        this.b=b;
    }
    void getResult(){
       ArrayList<Integer> getlist = this.getList();
       ArrayList<Integer> setlist = this.setList();
    }
    //사칙연산 입력받기
    char operationAdding() {
        boolean wrongoperator = true;
        while (wrongoperator) {
            System.out.println("연산자를 입력해주세요. + - * /");
            type = sc.nextLine();
            if (type.length() == 1) {
                type1 = type.charAt(0);
            } else {
                System.out.println("잘못된 입력값입니다.");
                continue;
            }
            if (type1 == '+' || type1 == '-' || type1 == '*' || type1 == '/') {
                wrongoperator = false;

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
        return type1;
    }


    private ArrayList<Integer> getList() {
        switch (type1) {
            case '+':
                System.out.println(a + b);
                list.add(a + b);
                break;
            case '-':
                System.out.println(a - b);
                list.add(a - b);
                break;
            case '*':
                System.out.println(a * b);
                list.add(a * b);
                break;
            case '/':
                if (b != 0) {
                    System.out.println(a / b);
                    list.add(a / b);
                } else {
                    System.out.println("0으로 나눌 수 없습니다.");
                }
                break;
            default:
                System.out.println("잘못된 연산자입니다.");
        }
        return list;
    }
    private ArrayList<Integer> setList () {

        exitflag = true;
        while (exitflag) {
            System.out.println(list);
            System.out.println("추가를 원하시면 'add'를 입력해주세요.");
            System.out.println("삭제를 원하시면 'del'를 입력해주세요.");
            System.out.println("작업을 원하지 않는다면 'skip'을 입력해주세요");
            String value = sc.nextLine();

            if (value.equalsIgnoreCase("add")) {
                System.out.println(list);
                System.out.println("인덱스는 0번 부터 시작합니다.");
                System.out.println("추가 :원하시는 추가값을 넣어주세요 ex:442 (마지막번째 인덱스 뒤에 442 추가)");

                if (sc.hasNextInt()){
                    int num = sc.nextInt();
                    list.add(num);
                    sc.nextLine();
                } else {
                    System.out.println("잘못된 입력입니다. 다시입력해주세요.");
                    sc.nextLine();
                }
            } else if (value.equalsIgnoreCase("del")) {
                System.out.println(list);
                System.out.println("인덱스는 0번 부터 시작합니다.");
                System.out.println("삭제 : 원하는 인덱스번호를 입력해주세요");
                if (sc.hasNextInt()) {
                    int index = sc.nextInt();
                    if (index >= 0 && index < list.size()) {
                        list.remove(index);

                    } else {
                        System.out.println("존재 하지않은 인덱스 입니다.");
                    }
                    sc.nextLine();

                } else {
                    System.out.println("잘못된 입력입니다. 다시입력해주세요");
                    sc.nextLine();
                }

            } else if (value.equalsIgnoreCase("skip")) {
                exitflag = false;
            } else {
                System.out.println("잘못된 입력값입니다 다시 입력해주세요");
            }
        }
        return list;
    }



    boolean restarting() {
        restarting = true;
        while (restarting) {

            System.out.println("계속하시려면 Y, 끝내시려면 N을 입력해주세요.(Y/N)");

            String accept = sc.nextLine();

            if (accept.equalsIgnoreCase("Y")) {
                System.out.println("계속 진행 됩니다.");
                restarting = false;
            } else if (accept.equalsIgnoreCase("N")) {
                System.out.println("프로그램을 종료합니다.");
                return true;
            } else {
                System.out.println("잘못된 입력입니다. Y 또는 N 을 입력해주세요.");
            }
        }
        return false;
    }

}