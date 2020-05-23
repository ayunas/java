package javabrains;

public class Calculator {


    int add(int x, int y) {
        return x + y;
    }

    int subtract(int x, int y) {
        return x - y;
    }

    int multiply(int x, int y) {
        return x * y;
    }

    int divide(int x, int y) {
        return Math.round(x / y);
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int sum = calc.add(4,3);
        if (sum != 5) {
            System.out.println("add function failed");
        } else {
            System.out.println("add function passed");
        }
    }
}
