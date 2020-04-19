package com.company;
import java.util.ArrayList;

public class ArrList {
    static ArrayList<Integer> intList = new ArrayList<Integer>();

    public static void main(String[] args) {
        intList.add(1);
        intList.add(2);
        intList.add(3);
        intList.add(4);
        intList.add(5);
        System.out.println(intList);

        for (int i=0; i<intList.size(); i++) {
            System.out.println(i + ": " + intList.get(i));
        }



    }






}
