import java.util.Calendar;
import java.util.Scanner;

//https://coderanch.com/t/547230/java/java-util-Date-getYear-method

public class UserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your year of birth");

        boolean isInt = scanner.hasNextInt();

        if (isInt) {
            int yob = scanner.nextInt();
            System.out.println("Enter your name: ");
            scanner.nextLine(); //enter key = ''
            String name =scanner.nextLine();
            Calendar calendar = Calendar.getInstance();
            int year = calendar.get(Calendar.YEAR);
            int age = year - yob;
            if (age > 0 && age < 120) {
                System.out.println(name + ", your age is : " + age);
            } else {
                System.out.println("Invalid year of birth");
            }

        }

//        System.out.println("Enter your name: ");
//        String name = scanner.nextLine(); //handle next line character (enter key)
//
//
//        System.out.println("What year were you born?");
//        int yob = scanner.nextInt();
//
//        Calendar calendar = Calendar.getInstance();
//        int year = calendar.get(Calendar.YEAR);
////        System.out.println(year);
//        int age = year - yob;
//
//
//        System.out.println("Your name is : " + name);
//        System.out.println("Your age is : " + age);

        scanner.close();
    }





}
