package ageChecker;

import java.util.Scanner;

public class App {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter an age: ");
        int age = scanner.nextInt();
        System.out.println("Enter a target age: ");
        int threshold = scanner.nextInt();

        AgeChecker checker = new AgeChecker(threshold);
        checker.checkAge(age);
    }
}
