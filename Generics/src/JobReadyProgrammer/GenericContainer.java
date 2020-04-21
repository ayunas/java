package JobReadyProgrammer;

import java.util.ArrayList;

public class GenericContainer<X> {

    X generic1;
    X generic2;

    GenericContainer(X gen1, X gen2) {
        this.generic1 = gen1;
        this.generic2 = gen2;
    }

    void printItems() {
        ArrayList<X> generics = new ArrayList<>();
        generics.add(generic1);
        generics.add(generic2);
        System.out.println("Printing contents of generics : " + generic1.getClass().getName() + " : ");
        System.out.println(generics);
    }

}
