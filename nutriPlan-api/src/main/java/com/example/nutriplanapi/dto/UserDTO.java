package com.example.nutriplanapi.dto;
import java.util.List;

public class UserDTO {
    private int age;
    private String gender;
    private int height;
    private int weight;
    private List<String> restrictions;
    private List<String> healthGoals;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public List<String> getRestrictions() {
        return restrictions;
    }

    public void setRestrictions(List<String> restrictions) {
        this.restrictions = restrictions;
    }

    public List<String> getHealthGoals() {
        return healthGoals;
    }

    public void setHealthGoals(List<String> healthGoals) {
        this.healthGoals = healthGoals;
    }
}

