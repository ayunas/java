package JobReadyProgrammer;

public class Main {


    public static void main(String[] args) {

        IntegerContainer integerContainer = new IntegerContainer(1,2);
        integerContainer.printItems();

        StringContainer strContainer = new StringContainer("1", "2");
        strContainer.printItems();

        DoubleContainer dubCont = new DoubleContainer(1.0,2.0);
        dubCont.printItems();

        GenericContainer<Integer> integerGenContainer = new GenericContainer<>(1,2);
        integerGenContainer.printItems();

        GenericContainer<String> stringGenericContainer = new GenericContainer<>("one","two");
        stringGenericContainer.printItems();

        GenericContainer<Double> doubleGenericContainer = new GenericContainer<>(1.0,2.0);
        doubleGenericContainer.printItems();

        TwoTypeContainer<Integer,String> twoTypeContainer = new TwoTypeContainer<>(3,"three");
        twoTypeContainer.printItems();

    }

//    public static void main(String[] args) {
//        ArrayList alist = new ArrayList();
//        //not specifying the content of the array list.
//        alist.add("hello");
//        alist.add(25);
//        alist.add(false);
//        //anything added here will be considered an object, not the intended value.
////        String val1 = alist.get(0);
////        String val2 = alist.get(1);
//
//        System.out.println(alist);
////        System.out.println(val1);
////        System.out.println(val2);
//
//    }
}
