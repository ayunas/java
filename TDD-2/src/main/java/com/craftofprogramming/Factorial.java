package com.craftofprogramming;

class Factorial {

    static int compute(int n) {
        if (n < 2) {
            return 1;
        }

        return n * compute(n-1);
    }


    public static void main(String[] args) {
        Factorial fact = new Factorial();
        //data type //variable name    //calling the Class
        int n = fact.compute(7);
        if (n == 120) {
            System.out.println("compute works!");
        } else {
            System.out.println("compute failed the test");
            System.out.println("value of computed factorial : " + n);
        }
    }
}
