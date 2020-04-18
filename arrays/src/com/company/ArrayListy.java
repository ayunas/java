package com.company;
import java.util.ArrayList;

public class ArrayListy {

    int[] myNumbers;
    static ArrayList<String> listy;

    public static void main(String[] args) {

        listy = new ArrayList<String>();
        listy.add("hello");
        listy.add("bon appetit");
        listy.add("cool beans");
        listy.set(1,"clams");

        ArrayList<String> array = new ArrayList<String>();

        System.out.println(listy);
        listy.forEach((l) -> System.out.println(l));
//        listy.forEach( (l,i) -> listy.set(2,"hi"));

        listy.addAll(array);
        System.out.println(listy);

        processArrayList();

    }

    static void processArrayList() {
        //different ways to create copies of ArrayLists
        //1. .addAll();
        GroceryList list = new GroceryList();
        list.addGroceryItem("beans");
        list.addGroceryItem("flour");
        list.addGroceryItem("spinach");
        list.addGroceryItem("yogurt");
        list.addGroceryItem("pineapples");
//        list.getGroceryList();
        ArrayList<String> arraylist = new ArrayList<String>();
        arraylist.addAll(list.getGroceryList());
        System.out.println("copy of grocery list using the addAll(): " + arraylist);
    }
}
