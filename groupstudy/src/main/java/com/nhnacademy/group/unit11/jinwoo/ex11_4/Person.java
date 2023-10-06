package com.nhnacademy.group.unit11.jinwoo.ex11_4;

public class Person {

    private final String name;
    private final String surName;
    private final int age;
    private final String residence;
    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public int getAge() {
        return age;
    }

    public String getResidence() {
        return residence;
    }

    public Person(String name, String surName, int age, String residence) {
        this.name = name;
        this.surName = surName;
        this.age = age;
        this.residence = residence;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", age=" + age +
                ", residence='" + residence + '\'' +
                '}';
    }
}
