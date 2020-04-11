public class LeapYear {

//    A leap year is exactly divisible by 4 except for century years (years ending with 00). The century year is a leap year only if it is perfectly divisible by 400.

    public static void main(String[] args) {
        if (args.length == 0) System.exit(-1);

        int year = Integer.parseInt(args[0]);
        boolean isLeap = leapYear(year);
        System.out.println(isLeap);
    }

    public static boolean leapYear(int year) {
        if (year < 1 || year > 9999) return false;

        int remainder;

        remainder = four(year);

        if (remainder == 0) {  // if year is divisible by 4, see if it is a century year
            remainder = hundred(year);
        } else {
            return false; //if not divisible by 4, by definition it is not a leap year.
        }

        if (remainder == 0) {
            remainder = fourhundred(year);  //if year passed test of divisible by 4, and its a century year, so check if the century year is divisible by 400.
        } else {
            return true;
        }

        if (remainder == 0) { //checking if century year is divisble by 400, if it is, the year is leap
            return true;
        } else {
            return false;  //if not the century year is not a leap year.
        }
    }

    public static int fourhundred(int year) {
        return year % 400;
    }


    public static int hundred(int year) {
        return year % 100;
    }



    public static int four(int year) {
        return year % 4;
    }



}
