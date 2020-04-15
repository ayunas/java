package com.company;

public class Car {

    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    public void setModel(String model) {
        if (model == "es250" || model == "es300" || model== "ls400") {
            this.model = model;
        } else {
            this.model = "Ain't Got Lex";
        }
    }

    public String getModel() {
        return this.model;
    }

}
