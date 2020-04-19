package Saveable;

import java.util.ArrayList;

public class Person implements Saveable {

    public static void main(String[] args) {
        System.out.println(arrlist);
        Person p = new Person();
        p.addList("Amir");
        p.addList("george");
        p.addList("mom");
        System.out.println(p.getList());
        System.out.println(arrlist);
    }

    @Override
    public ArrayList<String> getList() {
        return arrlist;
    }

    @Override
    public void addList(String person) {
        arrlist.add(person);
    }

}
