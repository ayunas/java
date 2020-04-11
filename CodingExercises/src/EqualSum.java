public class EqualSum {

    public static void main(String[] args) {
        if (args.length == 0) System.exit(-1);


        int num0 = Integer.parseInt(args[0]);
        int num1 = Integer.parseInt(args[1]);
        int num2 = Integer.parseInt(args[2]);

        boolean equal = hasEqualSum(num0,num1,num2);
        System.out.println(equal);
    }

    public static boolean hasEqualSum(int num1,int num2, int num3) {
        return ((num1 + num2) == num3);
    }

}





