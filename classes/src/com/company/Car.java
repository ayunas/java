package com.company;

//protected - classes in packages can access the class / private
public class Car {
    private int doors;
    private int wheels;
    public String model;  //violates OOP encapsulation.
    private String color;
    private int horsepower;

   public Car(int doors, int wheels, String model, String color, int horsepower) {  //no modifiers except public. th
       System.out.println("this is the constructor");
       this.doors = doors;
       this.wheels = wheels;
       this.color = color;
       this.horsepower = horsepower;
   }

   public Car() {
       System.out.println("Empty Constructor and Double Constructors allowed.");
   }


    public void mod(double mods) {
        this.horsepower += mods;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    //    public String setModel(String model) {
//        this.model = model;
//        return this.model;
//    }
//
//    public void setDoors(int doors) {
//        this.doors = doors;
//    }
//
//    public void setWheels(int wheels) {
//        this.wheels = wheels;
//    }
//
//    public void setColor(String color) {
//        this.color = color;
//    }
}
