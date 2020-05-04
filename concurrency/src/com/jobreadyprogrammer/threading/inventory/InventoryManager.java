package com.jobreadyprogrammer.threading.inventory;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class InventoryManager {

    List<Product> soldProductsList = new ArrayList<>();
//    List<Product> soldProductsList = new CopyOnWriteArrayList<>();

    void populateSoldProducts() throws InterruptedException {
        for(int i=1; i<=100000; i++) {
            this.soldProductsList.add(new Product(i,"Product-"+i));
//            Thread.sleep(300);
        }
    }

    void displaySoldProducts() throws InterruptedException {
        for(Product p : this.soldProductsList) {
            System.out.println(p.toString());
//            Thread.sleep(300);
        }
    }
}
