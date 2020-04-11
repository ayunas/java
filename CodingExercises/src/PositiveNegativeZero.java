public class PositiveNegativeZero {

    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        checkNumber(num);
    }

    public static void checkNumber(int number) {
        
        String result;
        
        if (number > 0) {
            result = ("positive");
        } else if (number < 0) {
            result = ("negative");
        } else {
            result = ("zero");
        }
        System.out.println(result);
    }
}
