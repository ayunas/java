package com.company;

public class Init {
    int num1;
    int num2;

    Init(int n1, int n2) {
        this.num1 = n1;
        this.num2 = n2;
//        num1 = n2;
//        num2 = n1;
    }

    public static void main(String[] args) {
        Init init = new Init(1,2);
        System.out.println(init.num1);
        System.out.println(init.num2);
//        System.out.println(Init.num1);
//        System.out.println(Init.num2);

    }

}
