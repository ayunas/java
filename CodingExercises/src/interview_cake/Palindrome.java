package interview_cake;


import java.util.ArrayList;
import java.util.Arrays;

public class Palindrome {

    private static ArrayList<String> reversed = new ArrayList<>(); //must initialize the ArrayList
    private static StringBuilder reversedStr = new StringBuilder();

    private static StringBuilder reverse(String str) {
        String[] stringed = str.split("");
//        System.out.println(Arrays.toString(stringed));

        for(int i=(stringed.length-1); i>=0; i--) {
//            System.out.println(stringed[i]);
            reversed.add(stringed[i]);
//            reversed.add(stringed[i]);
        }

        System.out.println("reversed " + reversed);

        reversed.forEach(c -> reversedStr.append(c));
        System.out.println("reversed Str : " + reversedStr);

        return reversedStr;
    }

    static boolean isPalindome(String str) {
//        return (str == reverse(str)); //no truthy and falsy coersion in Java
        String s1 = str;
        String s2 = reverse(str).toString();

        StringBuilder sb = new StringBuilder("daddy");
//        System.out.println(s1.equals(sb.toString()));

        return s1.equals(s2); // == only for reference comparison of memory address of objects.
    }

    public static void main(String[] args) {
        System.out.println(isPalindome("dad"));
    }
}










//Write an efficient method that checks whether any permutation ↴ of an input string is a palindrome. ↴
//
//You can assume the input string only contains lowercase letters.
//
//Examples:
//
//"civic" should return true
//"ivicc" should return true
//"civil" should return false
//"livci" should return false

//reverse the input string.  if reversal === original, it passes the test.  returns a boolean.
//break into an array
//push elemenets from back into a new dynamic array (ArrayList)
