import java.util.HashSet;

public class EqualArray {

    public static void main(String[] args) {

        HashSet<String> set = new HashSet<String>();

        for (int i=0; i<args.length; i++) {
            if (Integer.parseInt(args[i]) < 0) {
                System.out.println("Invalid Value");
                System.exit(-1);
            }
            set.add(args[i]);
        }

        if (set.size() < 1) {
            System.out.println("All numbers are equal");
        } else if (set.size() == args.length) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }
        System.out.println(set);
    }
}
