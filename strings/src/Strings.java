public class Strings {

    public static void main(String[] args) {
        System.out.println("hello to the world of strings.  strings are a type of class");
        System.out.println("byte\n");
        System.out.println("short\n");
        System.out.println("int\n");
        System.out.println("long\n");
        System.out.println("float\n");
        System.out.println("double\n");
        System.out.println("char\n");
        System.out.println("boolean\n");

        String string1 = "this is a string";
        System.out.println(string1 + " is the string just defined");
        string1 = string1 + "\u00A9 2020";
        System.out.println(string1);

        String numString = "49.95";
        numString = numString + "200.55";
        System.out.println(numString);
        int int1 = 10;
        String lastString = "10";
        lastString = lastString + int1;  //strings are immutable.  new instance of String created.  old one automatically discaded by Java
        System.out.println(lastString);

        //StringBuffer mutable strings.



    }


}
