import java.util.ArrayList;
import java.util.Arrays;

//a2=b2+c2−2bccosA,  calculating an SSS triangle. know the sides, need the angles.
// (a + b ) > c
public class TriangleOverload {

    int side1;
    int side2;
    int side3;
    double angle;

    public static void main(String[] args) {
        TriangleOverload tri1 = new TriangleOverload();
        int[] sides = {tri1.side1, tri1.side2, tri1.side3};
        for (int s : sides) {
            System.out.println(s);
        }

        TriangleOverload tri2 = new TriangleOverload(40);
        ArrayList<Integer> eqsides = new ArrayList<>(Arrays.asList(tri2.side1, tri2.side2, tri2.side3));
        System.out.println(eqsides);
    }

    TriangleOverload() { //no arguments passed in to the object generation default values given to each side
        this.side1 = 5;
        this.side2 = 10;
        this.side3 = 20;
        this.angle = 75;
    }

    TriangleOverload(int equalside) {
        this.side1 = equalside;
        this.side2 = equalside;
        this.side3 = equalside;
        this.angle = 60;
    }

    TriangleOverload(int side1, int side2) {

          int side3 = calcSide(side1,side2);
          double angle = calcAngle(side1,side2,side3);
          this(side1,side2,side3,angle);
//        this.side1 = side1;
//        this.side2 = side2;
//        this.side3 = this.calcSide(this.side1, this.side2);
//        this.angle = 24;
    }

    TriangleOverload(int side1, int side2, int side3, double angle) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.angle = angle;
    }


    int calcSide(int side1, int side2) {
        return 20;
    }

    double calcAngle(int side1, int side2, int side3) {
        return 75.56d;
    }


}
