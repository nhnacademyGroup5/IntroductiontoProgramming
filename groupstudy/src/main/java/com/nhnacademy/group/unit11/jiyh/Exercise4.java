package com.nhnacademy.group.unit11.jiyh;

public class Exercise4 {
    public static void main(String[] args) {
        ListOfPersons list = new ListOfPersons();

        Person p1 = new Person("j", "M", "home", 20);
        Person p2 = new Person("i", "M", "h1", 20);
        Person p3 = new Person("y", "M", "h2", 20);
        Person p4 = new Person("h", "M", "home", 20);

        list.insertPerson(p1);
        System.out.println(list.size());
        list.insertPerson(p2);
        System.out.println(list.size());
        list.insertPerson(p3);
        System.out.println(list.size());
        list.personPrint();

        System.out.println("---");
        list.insertPerson(p2, p4);
        list.personPrint();


        System.out.println("--");
        list.deletePerson(p2);
        list.personPrint();

        System.out.println(list.countresidence("home"));

    }
}
