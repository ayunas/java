package com.company;

public class Main {

    public static void main(String[] args) {

        Car porsche = new Car();
        Car lexus = new Car();
        Car gtr = new Car();


        lexus.setModel("es250");
        gtr.setModel(("GTR"));

        String lexModel = lexus.getModel();
        System.out.println(lexModel);


    }
}
