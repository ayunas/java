package com.company;

//Making Immutable Class:
//1. final class
//2. fields - private final
//3. create copies of all incoming reference data (arrays/hashmaps).  if you change an external reference, it will change the data in the class.
//4. no setter methods.


import java.util.HashMap;

public final class ImmutableStudent {  //final required here to prevent inheritance

    private final String name; //all fields (member variables) are private and final
    private final int studentID;

    ImmutableStudent(String name, int id) {  //if making constructor private, need to generate instances using factory method.  (advanced)
        this.name = name;
        this.studentID = id;
    }

    HashMap<String,String> getInfo() {
        HashMap<String,String> info = new HashMap<>();
        info.put("Name",this.name);
        info.put("Student ID",Integer.toString(this.studentID));
        return info;
    }
}
