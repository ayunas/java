package JobReadyProgrammer;

import java.util.ArrayList;

public class TwoTypeContainer<T1,T2> {
    T1 item1;
    T2 item2;

    TwoTypeContainer(T1 item1, T2 item2) {
        this.item1 = item1;
        this.item2 = item2;
    }

    void printItems() {
        System.out.println("Printing contents of " + this.item1.getClass().getName() + " : " + this.item1);
        System.out.println("Printing contents of " + this.item2.getClass().getName() + " : " + this.item2);
        ArrayList twotypes = new ArrayList<>();
        twotypes.add(this.item1);
        twotypes.add(this.item2);
        System.out.println(twotypes);
    }
}
