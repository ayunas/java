package com.healthy_coder;

import java.util.Arrays;
import java.util.HashMap;

public class Coder {
    private String name;
    private String[] skills;
    private int experience;

    Coder(String name, String[] skills, int experience) {
        this.name = name;
        this.skills = skills;
        this.experience = experience;
    }

    @Override
    public String toString() {
        HashMap<String,String> coder = new HashMap<>();
        coder.put("name", this.name);
        coder.put("skills", Arrays.toString(this.skills));
        coder.put("experience",Integer.toString(this.experience));
        return coder.toString();
    }
}

