package com.nhnacademy.group.unit11.jiyh;

public class Exercise5 {
    public static void main(String[] args) {
        Apartment apartment = new Apartment("광주", 24);

        apartment.add("person1");
        apartment.add("person2");
        apartment.add("person3");
        apartment.add("person4");

        System.out.println(apartment.countPersons());

    }
}
