package JobReadyProgrammer;

public class StringContainer {

    String item1;
    String item2;

    StringContainer(String item1, String item2) {
        this.item1 = item1;
        this.item2 = item2;
    }

    void printItems() {
        System.out.println("printing contents of " + this.item1.getClass().getName() + " container");
        String[] strings = {item1, item2};

        for (String s : strings) {
            System.out.println("Item : " + s);
        }

//
//        System.out.println("Item 1: " + item1);
//        System.out.println("Item 2: " + item2);
    }
}
