package com.nhnacademy.group.starcraft;

public class Guardian extends AirUnit implements Zerg{
    public Guardian() {
        super.tribe = TRIBE;
        super.att = 3;
        super.def = 6;
    }
}
