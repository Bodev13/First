package com.company.l3company;

public class Friend {

    String name;
    String gender;
    int age;

    public Friend(String name) {
        this.name = name;
    }

    public Friend(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Friend(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }
}
