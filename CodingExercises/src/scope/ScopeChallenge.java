package scope;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class ScopeChallenge {
    static Scanner scanner = new Scanner(System.in);
    int x=0;

    public static void main(String[] args) {
        HashMap<Integer,String> multable = new HashMap<>();

        System.out.println("Enter an integer: ");

        while(scanner.hasNextInt()) {
            System.out.println("Enter an integer: ");
            int x = scanner.nextInt();
            int[] xtable = new int[12];
            for (int i=1; i<=12; i++) {
                int m = x * i;
                xtable[i-1] = m;
            }
            multable.put(x, Arrays.toString(xtable));
        }
        System.out.println(multable);
    }





}
