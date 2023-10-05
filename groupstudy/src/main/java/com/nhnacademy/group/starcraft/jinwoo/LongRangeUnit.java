package com.nhnacademy.group.starcraft.jinwoo;

abstract class LongRangeUnit extends Unit{
    @Override
    protected boolean canAttackAirUnit(){
        return true;
    }
}
