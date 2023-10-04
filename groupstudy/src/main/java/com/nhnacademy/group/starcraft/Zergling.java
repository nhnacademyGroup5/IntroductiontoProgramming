package com.nhnacademy.group.starcraft;

public class Zergling extends CloseRangeUnit implements Zerg{
    public Zergling() {
        super.tribe = TRIBE;
        super.att = 2;
        super.def = 2;
    }
}
