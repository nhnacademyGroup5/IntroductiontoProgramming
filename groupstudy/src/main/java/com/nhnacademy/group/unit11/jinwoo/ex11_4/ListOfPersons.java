package com.nhnacademy.group.unit11.jinwoo.ex11_4;

import java.util.ArrayList;
import java.util.List;

public class ListOfPersons {
    private final List<Person> personList = new ArrayList<>();

    public int size(){
        return personList.size();
    }

    public Person search(int index){
        return personList.get(index);
    }

    public Person find(Person person){
        try {
            if (personList.contains(person))
                return person;
            else {
                throw new IllegalArgumentException("찾는 사람이 없습니다.");
            }
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
            return null;
        }
    }

    public Person find(String surName){
        try {
            for (Person person: personList) {
                if(person.getSurName().equals(surName)){
                    return person;
                }
            }
            throw new IllegalArgumentException("찾는 사람이 없습니다.");
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
            return null;
        }
    }

    public List<Person> findAll(String surName){
        List<Person> result = new ArrayList<>();
        try {
            if (find(surName) == null) {
                throw new IllegalArgumentException("찾는 값이 없습니다.");
            }
            for (Person person: personList) {
                if(person.getSurName().equals(surName)){
                    result.add(person);
                }
            }
            return result;
        } catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
            return result;
        }
    }

    public void add(Person person){
        personList.add(person);
    }

    public void delete(Person person){
        if(personList.contains(person)){
            personList.remove(person);
        } else{
            System.out.println("삭제할 사람이 존재하지 않습니다.");
        }
    }

    public void modify(Person newPerson){
        for (Person old: personList) {
            if(old.getName().equals(newPerson.getName()) && old.getSurName().equals(newPerson.getSurName())){
                personList.set(personList.indexOf(old), newPerson);
                break;
            }
        }
    }

    public void printAll(){
        for (Person person : personList) {
            System.out.println(person);
        }
    }

    public int numberOfResident(String city){
        int sum = 0;
        for (Person person : personList) {
            if(person.getResidence().equals(city)) sum++;
        }
        return sum;
    }

    public double averageOfAge(){
        int sum = 0;
        for (Person person : personList) {
            sum += person.getAge();
        }
        return (double) sum / personList.size();
    }

    public static void main(String[] args) {
        ListOfPersons list = new ListOfPersons();
        Person p = new Person("Lee", "Jinwoo", 30, "GwangJu");
        Person np = new Person("Lee", "Jinwoo", 30, "Gwang-Ju");
        list.add(p);
        list.printAll();
        list.modify(np);
        list.printAll();
    }
}
