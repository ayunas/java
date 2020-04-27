package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        ImmutableStudent student = new ImmutableStudent("amir",12345);
        System.out.println(student.getInfo());

//        Final f1 = new Final("f1");
//        Final f2 = new Final("f2");
//        Final f3 = new Final("f3");
//        Final f4 = new Final("f4");
//        Final f5 = new Final("f5");
//
//        System.out.println(Final.classCounter);
//        ArrayList<Final> finalies = new ArrayList<>();
//        finalies.addAll(Arrays.asList(f1,f2,f3,f4,f5));
//
//        finalies.forEach(f -> System.out.println(f.getInfo()));
//
//        Password p = new Password(123);
//        p.storePassword();
//        p.letMeIn(1243);
//        p.letMeIn(123);









//        Private p = new Private();
//        System.out.println(p.num1);
////      System.out.println(p.num2); will not work. num2 is a private instance variable.
//        System.out.println(p.getNum2());




//        Car toyota = new Car();
//        toyota.setModel("prius");
//        System.out.println(toyota.getModel());



//        Car porsche = new Car();
//        Car lexus = new Car();
////        porsche.model = "Carerra";  bad practice (violates encapsulation) to allow direct manipulation of properties in a class.  should all be private.
//        porsche.setModel("es300");
//        System.out.println("Model is: " + porsche.getModel());
//
//        SimpleCalculator calc = new SimpleCalculator();
//
//        calc.setNum1(10);
//        calc.setNum2(20);
//        System.out.println(calc.getNum1());
//        System.out.println(calc.getNum2());
//
//        Person p1 = new Person();
//
//        p1.setName("amir","yunas");
//        System.out.println(p1.getName());
//        p1.setAge(23);
//        p1.getPerson();
//        boolean teen = p1.isTeen();
//        System.out.println(teen);
//
//        Bank bank = new Bank();
//        String email = bank.getEmail();
//        System.out.println(email);
//
//        bank.deposit(20.00);
//        bank.deposit(30.00);
//        bank.deposit(100);
//        double balance = bank.getBalance();
//        System.out.println("current balance: " + balance);
//        bank.withdraw(30);
//        double balance2 = bank.getBalance();
//        System.out.println(balance2);
//        bank.withdraw(250);
//        double balance3 = bank.getBalance();
//        System.out.println(balance3);

//        Customer bob = new Customer("bob","bob@gmail.com","123 bobby blvd");
//        String name = bob.getName();
//        String email = bob.getEmail();
//        String address = bob.getAddress();
//
//        System.out.println(name);
//        System.out.println(email);
//        System.out.println(address);
//
//        Customer mystery = new Customer();
//        String name2 = mystery.getName();
//        String email2 = mystery.getEmail();
//        System.out.println(name2);
//        System.out.println(email2);

//        Dog doggy = new Dog("dalmation", 20, 60, 2, 4, 1, 42,"straight");
//        String name = doggy.getName();
//        System.out.println(name);
//        doggy.eat();

//        Static stuck = new Static("stuck in the middle");
//        Static still = new Static("still stuck with the chest");
//        still.printName();
//        stuck.printName();






    }
}

