package com.company;

import java.util.HashMap;

public class Final {
    final int instanceNum;
    static int classCounter = 0;
    final String name;

    Final(String name) {
        this.name = name;
        classCounter++;
        this.instanceNum = classCounter;
        System.out.println();
    }

    HashMap<String,String> getInfo() {
        HashMap<String,String> finalInstance = new HashMap<>();
        finalInstance.put("Name",this.name);
        finalInstance.put("Instance #",Integer.toString(this.instanceNum));
        return finalInstance;
    }
}

