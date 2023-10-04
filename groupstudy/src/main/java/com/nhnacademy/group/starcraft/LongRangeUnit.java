package com.nhnacademy.group.starcraft;

abstract class LongRangeUnit extends Unit{
    @Override
    protected boolean canAttackAirUnit(){
        return true;
    }
}
