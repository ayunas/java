package com.healthy_coder;

import java.util.Arrays;
import java.util.HashMap;

public class Coder {
    private String name;
    private String[] skills;
    private int experience;
    private double height;
    private double weight;

    public Coder(String name, String[] skills, int experience, double height, double weight) {
        this.name = name;
        this.skills = skills;
        this.experience = experience;
        this.height = height;
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public String[] getSkills() {
        return skills;
    }

    public int getExperience() {
        return experience;
    }

    @Override
    public String toString() {
        HashMap<String,String> coder = new HashMap<>();
        coder.put("name", this.name);
        coder.put("skills", Arrays.toString(this.skills));
        coder.put("experience",Integer.toString(this.experience));
        coder.put("height",Double.toString(this.height));
        coder.put("weight",Double.toString(this.weight));
        return coder.toString();
    }
}

