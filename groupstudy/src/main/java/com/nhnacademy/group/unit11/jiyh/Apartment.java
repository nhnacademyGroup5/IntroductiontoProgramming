package com.nhnacademy.group.unit11.jiyh;

import java.util.List;

public class Apartment {
    private double size;
    private String address;
    private List<String> livePerson;

    Apartment(String address, double size){
        this.size = size;
        this.address = address;
    }

    public void add(String name){
        livePerson.add(name);
    }

    public int countPersons(){
        return livePerson.size();
    }

    public void remove(int idx){
        livePerson.remove(idx);
    }

    public String get(int idx){
        return livePerson.get(idx);
    }



}
