package exercise_practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Function;
import java.util.function.Predicate;

public class Numbers {
    static ArrayList<Integer> nums = new ArrayList<>();

    public static void main(String[] args) {
        Numbers numbers = new Numbers();
        numbers.nums.addAll(Arrays.asList(1,2,3,4,5));

        Mathable added = () -> {
            int total = 0;
            for (int i = 0; i < nums.size(); i++) {
                total += nums.get(i);
            }
            return total;
        };

        System.out.println(added.calc());

        Mathable subtracted = () -> {
            int total = 0;
            for(int i=0; i<nums.size(); i++) {
                total -= nums.get(i);
            }
            return total;
        };

        Mathable findMin = () -> {
            int min = Integer.MIN_VALUE;
            for (int n : nums) {
                if (n < min) {
                    min = n;
                }
            }
            return min;
        };

        Mathable findMax = () -> {
            int max = Integer.MAX_VALUE;
            for (int n : nums) {
                if (n > max) {
                    max = n;
                }
            }
            return max;
        };

        Mathable multiply = () -> {
            int product = 1;
            for(int n : nums) {
                product *= n;
            }
            return product;
        };

        OneMathable append = (n) -> {
            nums.add(n);
            return nums.get(nums.size()-1);
        };

        System.out.println(append.calc(200));
        System.out.println(nums);



//        Function<Integer,Integer> append = (n) -> numbers.nums.add(n);
//        System.out.println(append.apply(10));




//        numbers.multiply();
//        numbers.sum();
//        numbers.findMax();
//        numbers.findMin();

    }

//    int append(int num) {
//        this.nums.add(num);
//        return nums.get(nums.size() - 1);
//    }
//
//    int sum() {
//        int total = 0;
//        for (int i=0; i<nums.size(); i++) {
//            total += nums.get(i);
//        }
//        return total;
//    }
//
//    int findMin() {
//        int min = Integer.MAX_VALUE;
//        for (int n : nums) {
//            if (n < min) {
//                min = n;
//            }
//        }
//        return min;
//    }
//
//    int findMax() {
//        int max = Integer.MIN_VALUE;
//        for(int n : nums) {
//            if (n > max) {
//                max = n;
//            }
//        }
//        return max;
//    }
//
//    int multiply() {
//        int product = 1;
//        for (int n : nums) {
//            product *= n;
//        }
//        return product;
//    }

      void printList() {
          System.out.println(this.nums);
      }


}

@FunctionalInterface
interface Mathable {
    int calc();
}

@FunctionalInterface
interface OneMathable {
    int calc(int n);
}

