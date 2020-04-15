package com.company;

public class SimpleCalculator {

    private double num1;
    private double num2;

    public double getNum1() {
       return this.num1;
    }

    public double getNum2() {
        return this.num2;
    }

    public void setNum1(double num) {
        this.num1 = num;
    }

    public void setNum2(double num) {
        this.num2 = num;
    }

    public double add() {
        return this.num1 + this.num2;
    }

}
