package com.company.InnerClass;

public class Main {

    public static void main(String[] args) {
        Body body = new Body();
        System.out.println(body.bones);
        body.displayBones();
//        System.out.println(Body.Skeleton.bones);
//        Body.Skeleton.showBones();
        Body.Skeleton skeletal = body.new Skeleton();

        System.out.println(skeletal.bones);



    }
}
