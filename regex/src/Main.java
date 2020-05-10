import java.util.Arrays;
import java.util.concurrent.atomic.*;


public class Main {

    public volatile int counter;


    public static void main(String[] args) {
        String string = "I am a string. Yes, yes I am.";
        System.out.println(string);

        String string2 = string.replaceAll("[Yy]es","no");
        System.out.println(string2);

        String string3 = string.replaceAll(".","y");
        System.out.println(string3);

        String[] array = {"a","b","c"};
        System.out.println(Arrays.toString(array));

        boolean matched = string.matches("I am a string");
        System.out.println(matched);

        String string4 = "abcDeefGhijklmnopqrabcSTUVWYYZ0123456789";
        String string5 = string4.replace("abc", "___");
        System.out.println(string5);

        String string6 = string4.replaceAll("789$","END");
        System.out.println("string6: " + string6);

        System.out.println(string5.matches("^___"));

        String regex = "^abc";
        System.out.println(string4.matches(regex));

        "harry".replaceAll("[hH]arry","Harry");

        String vowely = "abcDeeeFghijklmnopqrstuvwxyz".replaceAll("[^aeiou]","X");
        System.out.println(vowely);

        String sGroup = "setValue".replaceAll("set(Value)?","gotcha"); //Value is a Group.

        System.out.println(sGroup);

        String consonants = "abcdefghijklmnopqrstuvwxyz".replaceAll("([aeiou])","_");
        System.out.println(consonants);

        String nums = "1234567".replaceAll("\\d","num");
        System.out.println(nums);

        String digi = "123448473ASDFADasfhaskdlha13489203482903";
        String digitize = digi.replaceAll("\\D","digit");
        System.out.println(digitize);

        String hasWhitespace = "I have blanks and \t a tab and a newline\n";
        System.out.println(hasWhitespace);
        System.out.println(hasWhitespace.replaceAll("\\s","")); //removes all white spaces
        System.out.println("stringy\tbeans".replaceAll("\t",""));

        String toMarkUp = "Each word needs a strong tag around it.  I really want to wrap each and every word";

        String markedUp = toMarkUp.replaceAll("\\b(\\w+)\\b","<span>$1</span>");

        System.out.println(markedUp);
        













    }
}
