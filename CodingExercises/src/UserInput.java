import java.util.Scanner;

public class UserInput {
    //

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 1;
        int sum = 0;
        while (count <= 11) {
            System.out.println("Enter a number #"+ count);
            boolean isInt = scanner.hasNextInt();

            if (isInt) {
                int num = scanner.nextInt();
                sum += num;
                count++;
            } else {
                System.out.println("entered a non integer value");
                break;
            }

        }

        System.out.println("Sum of all numbers entered: " + sum);
        scanner.close();
    }
}
