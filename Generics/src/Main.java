import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();

        for (int i=1; i<=5; i++) {
            nums.add(i);
        }
//        nums.add("amir");  ArrayList of generic type <Integer> does not allow this

        nums.forEach( n -> System.out.println(n*2));
        System.out.println("\n======================");

        int[] numbers = {1,2,3,4,5};

        for (int n : numbers) {
            System.out.println(n*2);
        }



    }

}
