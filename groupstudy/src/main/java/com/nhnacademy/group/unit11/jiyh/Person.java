package com.nhnacademy.group.unit11.jiyh;

import java.util.Objects;

public class Person {
    private String name;
    private String gender;
    private String residence;
    private int age;
    private Person next;


    public Person(String name, String gender, String residence, int age) {
        this.name = name;
        this.gender = gender;
        this.residence = residence;
        this.age = age;
        this.next = null;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getResidence() {
        return residence;
    }

    public int getAge() {
        return age;
    }

    public Person getNext() {
        return next;
    }

    public void setNext(Person next) {
        this.next = next;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Person person = (Person) o;

        if (age != person.age) {
            return false;
        }
        if (!Objects.equals(name, person.name)) {
            return false;
        }
        if (!Objects.equals(gender, person.gender)) {
            return false;
        }
        return Objects.equals(residence, person.residence);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (gender != null ? gender.hashCode() : 0);
        result = 31 * result + (residence != null ? residence.hashCode() : 0);
        result = 31 * result + age;
        return result;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", residence='" + residence + '\'' +
                ", age=" + age +
                '}';
    }
}
