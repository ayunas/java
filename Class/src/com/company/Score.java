package com.company;

public class Score {

//    public static void main(String[] args) {
//        score();
//    }

    public static void score() {
        System.out.println("hello Score Class");
        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;
        String name = "Amir";
        int rank = calcScore(score);
        displayHighScore(name,rank);
        int rank2 = calcScore(1000);
        displayHighScore("Percy",rank2);
    }

    public static void displayHighScore(String name, int rank) {
        System.out.println(name + " ranked #" + rank);
    }

    public static int calcScore(int score) {
        int rank = 4;
        if (score >= 1000) {
            rank = 1;
        } else if (score >= 500) {
            rank = 2;
        } else if (score >= 100) {
            rank =  3;
        }
        return rank;
    }
}