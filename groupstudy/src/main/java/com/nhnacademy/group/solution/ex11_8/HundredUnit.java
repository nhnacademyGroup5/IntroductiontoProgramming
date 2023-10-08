package com.nhnacademy.group.solution.ex11_8;

public class HundredUnit {
    private int num;

    public HundredUnit(int num) {
        try {
            if (num < 0 || num >= 1_000_000_000) {
                throw new IllegalArgumentException("맞지 않는 값입니다.");
            }
            this.num = num;
        } catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }

//    public int exceedNumber(HundredUnit num){
//        return this.num + num
//    }
}
