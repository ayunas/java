import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

class DemoCollection {


    public static void main(String[] args) {
        int[] values = new int[4];
        Object[] objValues = new Object[4];
        objValues[0] = "Navin Reddy";
        objValues[1] = 7;

        Collection<Integer> colValues = new ArrayList<Integer>();
        colValues.add(3);
//        colValues.add("Navin");
//        colValues.add(5.8F);

        Collection<Object> colValuesO = new ArrayList();
        colValuesO.add(3);
        colValuesO.add("Navin");
        colValuesO.add(5.8F);

//          old way of looping through a collection.
//          Iterator i = colValues.iterator();
//          while (i.hasNext()) System.out.println(i.next());

        for (int item : colValues) {
            System.out.println(item);
        }
        for (Object i : colValuesO) {
            System.out.println(i);
        }

        ArrayList<Integer> ints = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        ints.forEach(i -> System.out.println(i));

    }
}
