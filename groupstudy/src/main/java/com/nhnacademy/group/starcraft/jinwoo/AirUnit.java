package com.nhnacademy.group.starcraft.jinwoo;

abstract class AirUnit extends Unit{
    @Override
    protected boolean isFly(){
        return true;
    }
    @Override
    protected boolean canAttackAirUnit(){
        return true;
    }
}
