package com.nhnacademy.group.starcraft.jinwoo;

abstract class Unit {

    protected String tribe;
    protected int att;
    protected int def;

    protected boolean isFly(){
        return false;
    }

    protected boolean canAttackAirUnit() {
        return false;
    }

    private boolean compatibility(Unit unit){
        if(this.isFly()) return true;
        if(this.canAttackAirUnit()) return true;
        return !unit.isFly();
    }

    protected Unit attack(Unit unit){
        try {
            if(compatibility(unit)){
                unit.def = unit.def - this.att;
                return unit;
            }
            throw new IllegalArgumentException("공격할 수 없는 대상 입니다.");
        } catch(IllegalArgumentException e){
            return null;
        }
    }

    @Override
    public String toString() {
        String name = getClass().getName().substring(getClass().getName().lastIndexOf(".") + 1);
        return name + " (현재 방어력 : " + def + ")";
    }
}
