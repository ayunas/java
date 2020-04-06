package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here.
        int score1 = 1000;
        int score2 = 2000;
        int score3 = 3000;

        int val = sum(score1,score2,score3);
        System.out.println(val);

    }

    public static int sum(int score1, int score2, int score3) {
        return score1 + score2 + score3;
    }
//
//    public static void calcScore(type[] array) {
//        System.out.println(array);
//    }



}
