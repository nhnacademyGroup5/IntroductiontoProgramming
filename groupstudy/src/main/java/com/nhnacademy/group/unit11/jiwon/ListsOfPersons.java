package com.nhnacademy.group.unit11.jiwon;

import java.util.ArrayList;
import java.util.List;

public class ListsOfPersons {
    private List<Person> persons;

    public ListsOfPersons() {
        persons = new ArrayList<>();
    }

    public void insertPerson(String fisrstName, String lastName, int age, String residence) {
        Person person = new Person(fisrstName, lastName, age, residence);
        persons.add(person);
    }

    public void deletePerson(String firstName, String lastName) {
        persons.removeIf(
                person -> person.getFirstName().equals(firstName) &&
                        person.getLastName().equals(lastName));
    }

    public double averageAge() {
        return persons.stream()
                .mapToDouble(Person::getAge)
                .average()
                .orElse(0);
    }

    public void printAllPersons() {
        persons.forEach(person -> System.out.println(
                "Name: " + person.getFirstName() + ", Surname: " + person.getLastName() +
                        ", Age: " + person.getAge() + ", City: " + person.getResidence()));
    }

    public long countPersonsInCity(String city) {
        return persons.stream()
                .filter(person -> person.getResidence().equals(city))
                .count();
    }

    public static void main(String[] args) {
        ListsOfPersons personList = new ListsOfPersons();

        personList.insertPerson("jiwon", "kim", 28, "gwangju");
        personList.insertPerson("jawon", "kim", 29, "mokpo");
        personList.insertPerson("jione", "park", 30, "gwangju");

        System.out.println("All persons:");
        personList.printAllPersons();
        personList.deletePerson("jiwon", "kim");

        System.out.println("\nnew Persons List:");
        personList.printAllPersons();

        System.out.println(
                "\nNumber of persons in gwangju: " + personList.countPersonsInCity("gwangju"));
        System.out.println("Average age of all persons: " + personList.averageAge());
    }
}
