import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


class Debugger {
    static int num1 = 1;
    int num2 = 2;
    int num3 = 3;
    int num4 = 4;
    String s1 = "hi";
    String s2 = "hello";
    String s3 = "bonjour";
    String s4 = "marhaban";

    public static void main(String[] args) {
        Debugger debug = new Debugger();

        String[] strings = {debug.s1,debug.s2,debug.s3,debug.s4};
        int[] nums = {num1,debug.num2,debug.num3,debug.num4};

//        String[] strings = {"s1","s2","s3","s4"};
        List<String> stringList = Arrays.asList(strings);
        System.out.println(stringList);

//        https://stackoverflow.com/a/1073933/8161309 // Arrays.asList() does not account for autoboxing, which is required for int -> Integer

//        int[] nums = {1,2,3,4};
//        ArrayList<Integer> numlist = Arrays.asList(nums);
//        System.out.println(numList);

        List<Integer> numList = Arrays.stream(nums).boxed().collect(Collectors.toList()); //Convert an integer array int[] noms -> List<Integer>. : use a Stream, box it, then collect it into a list.
        System.out.println(numList);






//        ArrayList<Integer> numList = Arrays.asList(nums);
//        ArrayList<Integer> numList = new ArrayList(Arrays.asList(nums));
//        System.out.println("num Array List: " + numList);

//
//
//        System.out.println(Arrays.toString(nums));
//        System.out.println(Arrays.toString(strings));
//
//        for(int n : nums) {
//            System.out.println(n);
//        }
//
//        for(String s : strings) {
//            System.out.println(s);
//        }
//
//
//
//        IntStream intStream = Arrays.stream(nums);
//        Stream intStreamB = intStream.boxed();
//        intStreamB.forEach(i -> System.out.println(i));



//        List<Integer> numList = Arrays.asList(nums);




    }





}
