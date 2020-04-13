public class Prime {

    public static void main(String[] args) {
        if (args.length == 0) System.exit(-1);

        int num = Integer.parseInt(args[0]);
        boolean prime = isPrime(num);
        System.out.println(prime);

    }

    public static boolean isPrime(int num) {

        if (num == 1) return false;



//        for (int i=2; i < (long) Math.sqrt(num); i++) {  //more efficient
        for (int i=2; i < (n/2); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
