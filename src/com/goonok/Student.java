package com.goonok;

public class Student {
    private int stID;
    private String name;
    private int age;

    public Student(){

    }
    public Student(int stID, String name, int age) {
        this.stID = stID;
        this.name = name;
        this.age = age;
    }

    public int getStID() {
        return stID;
    }

    public void setStID(int stID) {
        this.stID = stID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stID=" + stID +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
