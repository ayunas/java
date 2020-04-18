package com.company;

import java.util.ArrayList;

public class GroceryList {
    static ArrayList<String> groceries = new ArrayList<String>();
    //

    public static void main(String[] args) {
        GroceryList gl = new GroceryList();
        gl.addGroceryItem("cheese");
        gl.addGroceryItem("milk");
        gl.addGroceryItem("beans");
        gl.showGroceryList();
        gl.editGroceryList(0,"barley");
        gl.showGroceryList();
        gl.removeItem("barley");
        gl.showGroceryList();
    }

    ArrayList<String> getGroceryList() {
        return groceries;
    }

    void addGroceryItem(String item) {
        groceries.add(item);
    }

    void showGroceryList() {
        System.out.println(groceries);
    }

    void editGroceryList(int index, String item) {
        groceries.set(index,item);
    }

    void removeItem(String item) {
        int index = groceries.indexOf(item);
        groceries.remove(index);
    }

}
