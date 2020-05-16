import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {

        Random ran = new Random();
        int result = ran.nextInt(51);

        int[] num = new int[10];
        int count = 0;
        int guess = -1;

        Scanner scn = new Scanner(System.in);
        while (guess != result) {

            if (count >= 10) {
                //forcefully break the loop after 10 tries
                break;
            }

            System.out.println("Please enter a guess (0-50)");
            guess = scn.nextInt();
            num[count] = guess;

            if (guess < result) {
                System.out.println("Too low");
            } else if (guess > result) {
                System.out.println("Too high");
            } else {
                System.out.println("You got it");
            }

            count++;
        }

        if (count >= 10) {
            System.out.println("Sorry you lost the game");
        }

        // After the game ends
        System.out.println("It took you " + count + " tries");
        System.out.println("Below are your guessed numbers");
        for (int i = 0; i < count; i++) {
            System.out.print(num[i] + " ");
        }
    }
}
