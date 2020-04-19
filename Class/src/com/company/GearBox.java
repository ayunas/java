package com.company;

import java.util.ArrayList;

public class GearBox {
    ArrayList<Gear> gears;
    int gearNumber = 20;

    public static void main(String[] args) {
        GearBox cool = new GearBox();
        System.out.println(cool.gearNumber);
//        GearBox.Gear.gearNumber;

        GearBox.Gear inner = cool.new Gear(20,25.25d);

        System.out.println(inner.gearNumber);


    }

    public class Gear {
        int gearNumber = 40;
        double ratio;

//        public void main(String[] args) {
////            System.out.println(this.gearNumber);
//        }

        Gear(int gearNumber, double ratio) {
            this.gearNumber = gearNumber;  //this refers to the outer class.
            this.ratio = ratio;
        }

        double driveSpeed(int revs) {
            return revs * this.ratio;
        }
    }
}
