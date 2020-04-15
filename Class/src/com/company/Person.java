package com.company;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public String getName() {
        return (this.firstName + " " + this.lastName);
    }

    public void setName(String first,String last) {
        this.firstName = first;
        this.lastName = last;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void getPerson() {
        String person = "{ " + "firstName" + ": " + this.firstName + ", " + "lastName : " + this.lastName +  ", age : " + this.age + "}";
        System.out.println(person);
    }

    public boolean isTeen() {

        return (this.age >= 13 && this.age <= 19) ? true : false;
//
//        if (this.age >= 13 && this.age <= 19) return true;
//        } else return false;
    }

}
