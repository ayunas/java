package com.oracle.docs;

import com.sun.jdi.InternalException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Interrupted {

    public static void main(String[] args) throws InterruptedException {
        List<Integer> alist = new ArrayList<>();
        alist.addAll(Arrays.asList(12,3,4,5,67,7,4,3,2,7,29));

        


        for(int n : alist) {
           Thread.sleep(1000);
        }
    }
}
