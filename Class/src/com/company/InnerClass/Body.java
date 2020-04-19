package com.company.InnerClass;

public class Body {
    int bones = 200;

    void displayBones() {
        System.out.println(this.bones);
    }


    public class Skeleton {
        int bones = 300;

        void showBones() {
            System.out.println(bones);
        }

    }






}
