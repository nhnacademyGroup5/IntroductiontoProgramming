package com.nhnacademy.group.starcraft;

public class Scout extends AirUnit implements Protoss{
    public Scout() {
        super.tribe = TRIBE;
        super.att = 5;
        super.def = 10;
    }
}
