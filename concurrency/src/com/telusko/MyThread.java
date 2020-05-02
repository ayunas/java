package com.telusko;

import java.util.Arrays;

public class MyThread extends Thread {


    @Override
    public void run() {
        int[] nums = {1,2,3,4,5,6};

        for(int i=0; i < nums.length; i++) {
            nums[i] *= 2;
        }

        System.out.println(Arrays.toString(nums));
    }


    public static void main(String[] args) {
       Thread th1 = new MyThread();
       Thread th2 = new MyThread();
       Thread th3 = new MyThread();
       th1.start();
       th2.start();
       th3.start();
    }
}
