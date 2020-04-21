package JobReadyProgrammer;

public class DoubleContainer {
    Double dub1;
    Double dub2;

    DoubleContainer(double dub1, double dub2) {
        this.dub1 = dub1;
        this.dub2 = dub2;
    }

    void printItems() {
        double[] dubs = {dub1,dub2};
        System.out.println("printing contents of " + this.dub1.getClass().getName() + " container");
        for (double d : dubs) {
            System.out.println(d);
        }
    }


}
