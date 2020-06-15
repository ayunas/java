import java.util.*;

public class Listy {

    public static void main(String[] args) {
        List<String> listy = new ArrayList<>();
        listy.add("item 1");
        listy.add("item 2");
        listy.add("item 3");
        System.out.println(listy);

        List<String> listy2 = Arrays.asList("item 1","item 2","item 3");

        System.out.println(listy2);

    }

}