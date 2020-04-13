public class sumDigits {

    public static void main(String[] args) {
        if (args.length == 0) System.exit(-1);

        int num = Integer.parseInt(args[0]);

        int sum = sumDigits(num);
        System.out.println(sum);
    }


    public static int sumDigits(int num) {

        //extract the end of the number, and add it to a summer;
        // discard the end number.
        //return the summer when the num <= 0.

        int sum = 0;

        while (num > 0) {
            int last = num % 10;
            sum += last;
            num /= 10;
        }

        return sum;

    }


}
