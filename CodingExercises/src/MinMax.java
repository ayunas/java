import java.util.Scanner;

public class MinMax {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int min = Integer.MAX_VALUE;  //guranteed the user will enter a value that is less than this.
        int max = Integer.MIN_VALUE;  //guaranteee user will enter a value that is more than this.

        int high = 0;
        int low = 0;
        boolean first = true;

        System.out.println("type exit to end the program...");

        while (true) {
            System.out.println("Enter Number: ");

            boolean isInt = scanner.hasNextInt();
            if (isInt) {
                int num = scanner.nextInt();

                if (first) {
                    first = false;
                    high = num;
                    low = num;
                }

                if (num > high) {
                    high = num;
                }

                if (num < low) {
                    low = num;
                }
            } else {
               break;
            }
        }
        System.out.println("max: " + high);
        System.out.println("min: " + low);
    }



}
