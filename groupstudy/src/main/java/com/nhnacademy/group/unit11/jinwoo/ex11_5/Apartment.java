package com.nhnacademy.group.unit11.jinwoo.ex11_5;

import com.nhnacademy.group.unit11.jinwoo.ex11_4.*;

// Ex 7.12.
public class Apartment {
    private final int size;
    private final int address;
    private final ListOfPersons list;

    public Apartment(int size, int address) {
        this.size = size;
        this.address = address;
        this.list = new ListOfPersons();
    }

    public int getSize() {
        return size;
    }

    public int getAddress() {
        return address;
    }

    public ListOfPersons getList() {
        return list;
    }

    public void moveIn(Person person){
        list.add(person);
    }

    public Person whoIsLiveIn(int n){
        try {
            if(n < 0) throw new IllegalArgumentException("양수만 입력 해야 합니다.");
            if(n >= list.size()) throw new IllegalArgumentException("없는 번호 입니다.");
            return list.search(n);
        } catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
            return null;
        }
    }

    public void moveOut(int n){
        try {
            if(n < 0) throw new IllegalArgumentException("양수만 입력 해야 합니다.");
            if(n >= list.size()) throw new IllegalArgumentException("없는 번호 입니다.");
            list.delete(list.search(n));
        } catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }

    public int countPerson(){
        return list.size();
    }

    public void checkFamily(String surName){
        try {
            if (list.findAll(surName).isEmpty()) {
                throw new IllegalArgumentException("찾는 값이 없습니다.");
            }
            for (Person person: list.findAll(surName)) {
                System.out.println(person);
            }
        } catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public String toString() {
        return size + "평형 아파트 " + address + "동" + "\n " + "현재 거주자 : " + countPerson() + "명";
    }
}
