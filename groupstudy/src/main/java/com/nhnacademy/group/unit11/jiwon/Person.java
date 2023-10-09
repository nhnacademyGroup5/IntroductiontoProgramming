package com.nhnacademy.group.unit11.jiwon;
public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String residence;

    public Person(String firstName, String lastName, int age, String residence) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.residence = residence;
    }


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getResidence() {
        return residence;
    }


}
