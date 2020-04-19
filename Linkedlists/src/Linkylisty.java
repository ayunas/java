import java.util.Iterator;
import java.util.LinkedList;

public class Linkylisty {

    public static void main(String[] args) {
        LinkedList<String> locations = new LinkedList<String>();
        locations.add("irving");
        locations.add("plano");
        locations.add("sandy");
        locations.add("hanover");
        locations.add("zurich");

        printList(locations);

    }

    static void printList(LinkedList<String> linkedlist) {
        Iterator<String> i = linkedlist.iterator();

       while (i.hasNext()) {
           System.out.println("Now visiting " + i.next());
           System.out.println("===========================");
       }

    }


}
