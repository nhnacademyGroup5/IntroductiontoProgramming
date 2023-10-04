package com.nhnacademy.group.starcraft;

public class Marine extends CloseRangeUnit implements Terran{
    public Marine() {
        super.tribe = TRIBE;
        super.att = 3;
        super.def = 10;
    }
}
